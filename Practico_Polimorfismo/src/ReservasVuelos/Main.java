package ReservasVuelos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Reserva aplicacion = new Reserva("Aerolineas Argentinas");
        while (true) {
            System.out.println("Seleccione una opcion: \n1 Reserva Regular \n2 Reserva Charter " +
                    "\n3 Mostrar total de Reservas \n4 Mostrar Reservas \n5 Salir");
            String opcion = input.nextLine();
            switch (opcion) {
                case "1":
                    aplicacion.crear_vuelo_regular();
                    break;
                case "2":
                    aplicacion.crear_vuelo_charter();
                    break;
                case "3":
                    System.out.println("El total de vuelos es de $" + aplicacion.calcular_total_reservas());
                   break;
                case "4":
                    aplicacion.mostrar_vuelos();
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    continue;

            }
            if (opcion.equals("5")) {
                break;
            }
        }
    }
}
