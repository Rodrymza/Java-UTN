package SistemPagos;

import java.util.ArrayList;
import java.util.Scanner;

public class Pagos {
    ArrayList<MetodoPago> historial_pagos = new ArrayList<>();

    public Pagos() {
    }
    public void agregar_pago(MetodoPago pago_nuevo){
        historial_pagos.add(pago_nuevo);
        System.out.println("Pago agregado al historial");
    }

    public static String pedir_datos(String mensaje) {
    Scanner input = new Scanner(System.in);
    System.out.println(mensaje);
    String ingreso = input.nextLine();
    return ingreso;
    }

    public void cancelar_pago(){
        Scanner input = new Scanner(System.in);
        while (true) {
            int i = 1;
            for (MetodoPago pago : historial_pagos) {
                System.out.println(i + ". pago de " + pago.getTitular());
            }
            int indice = Integer.parseInt(pedir_datos("Seleccione pago a cancelar"));
            if (indice >= 1 && indice <= historial_pagos.toArray().length) {
                MetodoPago pago = historial_pagos.get(indice-1);
                if (pago instanceof PayPal || pago instanceof TarjetaCredito){
                    ((Cancelable) pago).cancelarPago();
                    break;
                }
            }
        }

    }
    public void mostrar_pagos() {
        System.out.println("--------Medios de pago disponibles--------");
    int i = 1;
    for (MetodoPago elemento: historial_pagos) {
        System.out.println(i + ". Titular: " + elemento.getTitular());
        i++;
    }
    System.out.println("---------------------------");
    }



}

