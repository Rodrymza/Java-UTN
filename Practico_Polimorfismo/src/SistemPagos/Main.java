package SistemPagos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pagos gestion_pagos = new Pagos();
        Scanner input = new Scanner(System.in);
        while (true) {
            mostrar_menu();
            String seleccion = input.nextLine();
            switch (seleccion) {
                case "1":
                    PayPal nuevo_paypal= nuevo_paypal();
                    gestion_pagos.agregar_pago(nuevo_paypal);
                    break;
                case "2":
                    TarjetaCredito nuevo_tarjeta = nuevo_tarjeta();
                    gestion_pagos.agregar_pago(nuevo_tarjeta);
                    break;
                case "3":
                    gestion_pagos.mostrar_pagos();
                    break;
                case "4":
                    gestion_pagos.cancelar_pago();
                    break;
                case "5":
                    System.out.println("Saliendo del la aplicacion...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    continue;
            }
            if (seleccion.equals("5")) {
                break;
            }
        }
    }
    public static void mostrar_menu() {
        System.out.println("1. Realizar un pago PayPal \n2. Realizar pago Tarjeta \n3. Mostrar Pagos \n4. Cancelar pago \n5. Salir");
    }
    public static PayPal nuevo_paypal() {
        String titular = Pagos.pedir_datos("Ingrese titular del PayPal");
        int numero = Integer.parseInt(Pagos.pedir_datos("Ingrese numero de cuenta"));
        String correo = Pagos.pedir_datos("Ingrese correo electronico");
        PayPal nuevo_pago = new PayPal(titular,numero, correo );
        return nuevo_pago;
    }
    public static TarjetaCredito nuevo_tarjeta() {
        String titular = Pagos.pedir_datos("Ingrese titular de la tarjeta");
        int numero = Integer.parseInt(Pagos.pedir_datos("Ingrese numero de tarjeta"));
        String fecha_vencimiento = Pagos.pedir_datos("Ingrese fecha vencimiento");
        int codigo = Integer.parseInt(Pagos.pedir_datos("Codigo de seguridad"));
        TarjetaCredito nuevo_pago = new TarjetaCredito(titular ,numero, fecha_vencimiento, codigo );
        return nuevo_pago;
    }
}
