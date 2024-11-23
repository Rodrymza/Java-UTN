package SistemPagos;

public class TarjetaCredito extends MetodoPago implements Cancelable{
    String fechaVencimiento;
    int codigo_seguridad;

    public TarjetaCredito(String titular, int numero, String fechaVencimiento, int codigo_seguridad) {
        super(titular, numero);
        this.fechaVencimiento = fechaVencimiento;
        this.codigo_seguridad = codigo_seguridad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCodigo_seguridad() {
        return codigo_seguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con tarjeta realizado correctamente");
    }

    @Override
    public void cancelarPago() {
        Cancelable.super.cancelarPago();
        System.out.println("Pago con tarjeta de credito anulado");
    }
}
