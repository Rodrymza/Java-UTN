package SistemPagos;

public interface Cancelable {
    default void cancelarPago(){
        System.out.println("Se realizo la cancelacion del pago correctamente");
    }
            ;
}
