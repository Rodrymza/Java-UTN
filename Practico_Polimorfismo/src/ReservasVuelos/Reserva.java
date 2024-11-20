package ReservasVuelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    private String nombre;
    ArrayList<Vuelo> lista_vuelos = new ArrayList<>();

    public Reserva(String nombre) {
        this.nombre = nombre;
    }

    public void agregar_vuelo_(Vuelo vuelo_agregar) {
        lista_vuelos.add(vuelo_agregar);
        System.out.println("Se agrego el vuelo correctamente a las reservas");
    }
    public void crear_vuelo_regular() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de vuelo:");
        int numero = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el origen del vuelo");
        String origen = input.nextLine();
        System.out.println("Ingrese el destino del vuelo");
        String destino = input.nextLine();
        System.out.println("Ingrese fecha del vuelo");
        String fecha = input.nextLine();
        System.out.println("Ingrese numero de asientos del vuelo");
        int numero_asientos = Integer.parseInt(input.nextLine());
        VueloRegular nuevo_vuelo = new VueloRegular(numero, origen, destino, fecha, numero_asientos);
        agregar_vuelo_(nuevo_vuelo);
    }
    public void crear_vuelo_charter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de vuelo:");
        int numero = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el origen del vuelo:");
        String origen = input.nextLine();
        System.out.println("Ingrese el destino del vuelo:");
        String destino = input.nextLine();
        System.out.println("Ingrese la fecha del vuelo:");
        String fecha = input.nextLine();
        System.out.println("Ingrese el precio total del vuelo:");
        int precioTotal = Integer.parseInt(input.nextLine());
        VueloCharter nuevo_vuelo = new VueloCharter(numero, origen, destino, fecha, precioTotal);
        System.out.println("Valor total del vuelo $" + nuevo_vuelo.calcularPrecio());
        agregar_vuelo_(nuevo_vuelo);
    }
    public int calcular_total_reservas() {
        int total = 0;

        for (Vuelo vuelo_acutal: lista_vuelos) {
            total += vuelo_acutal.calcularPrecio();
        }
        return total;
    }
    public int aplicar_promociones(Vuelo vuelo_promocionar) {
        int precioiFinal = vuelo_promocionar.aplicarPromocion();
        return precioiFinal;
    }
    public void mostrar_vuelos() {
        System.out.println("Lista de vuelos:");
        for (Vuelo vuelo_actual : lista_vuelos) {
            vuelo_actual.mostrar_vuelo();
        }
    }
}