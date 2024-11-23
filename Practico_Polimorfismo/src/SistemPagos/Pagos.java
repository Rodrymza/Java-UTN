package SistemPagos;

import java.util.ArrayList;
import java.util.Scanner;

public class Pagos {
    ArrayList<MetodoPago> lista_metodos_pago = new ArrayList<>();

    public Pagos() {
    }
    public void agregar_papal(){



    }

    public String pedir_datos(String mensaje) {
    Scanner input = new Scanner(System.in);
    System.out.println(mensaje);
    String ingreso = input.nextLine();
    return ingreso;
    }

    public void mostrar_medios(ArrayList<MetodoPago> lista_medios) {
        System.out.println("--------Medios de pago disponibles--------");
    int i = 1;
    for (MetodoPago elemento: lista_medios) {
        System.out.println(i + ". Titular: " + elemento.getTitular());
        i++;
    }
    System.out.println("---------------------------");
    }

    public void cancelar_tarjeta(TarjetaCredito pago_usado) {
    pago_usado.cancelarPago();
    }

    public void cancelar_paypal(PayPal paypal_usado){
    paypal_usado.cancelarPago();
    }

    public PayPal seleccionar_paypal(ArrayList<PayPal> lista_medios){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione un elemento de la lista");
            int seleccion = Integer.parseInt(input.nextLine())-1;
            if (seleccion <= lista_medios.toArray().length && seleccion >= 0) {
                return lista_medios.get(seleccion);
            } else {
                System.out.println("Seleccion invalida");
            }
        }
    }
    public TarjetaCredito seleccionar_tarjeta(ArrayList<TarjetaCredito> lista_medios){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione un elemento de la lista");
            int seleccion = Integer.parseInt(input.nextLine())-1;
            if (seleccion <= lista_medios.toArray().length && seleccion >= 0) {
                return lista_medios.get(seleccion);
            } else {
                System.out.println("Seleccion invalida");
            }


        }
    }
}

