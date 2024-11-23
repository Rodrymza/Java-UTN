package SistemPagos;

import java.util.Scanner;

public class PayPal extends MetodoPago implements Cancelable{
    String correoElectronico;
    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }
    @Override
    public void realizarPago() {
        System.out.println("Pago via PayPal realizado correctamente");
        System.out.println("Comprobante enviado a " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        titular = "Pago cancelado";
        System.out.println("Pago PayPal anulado, enviado comprobante a " + correoElectronico);
    }
}
