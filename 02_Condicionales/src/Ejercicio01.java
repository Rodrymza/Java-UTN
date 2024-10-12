//Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
//ciencia ficción) y luego recomiende una película basada en su elección.
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        System.out.println("Sistema de recomendacion de peliculas\n" +
                        "Selecciona el genero\n"+
                        "1 Accion \n2 Comedia \n3 Drama \n4 Ciencia Ficcion");
        int opcion = input.nextInt();

        while (opcion < 1 || opcion > 4) {
            System.out.println("*** Opcion incorrecta ***");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Acion:\n" +
                            "1. Mad Max; Fury Road (2015)\n" +
                            "2. John Wick (2014)\n" +
                            "3. Duro de matar (1998)");
                    break;
                case 2:
                    System.out.println("Comedia:\n" +
                            "1. Super cool (2015)\n" +
                            "2. Qué paso ayer (2009)\n" +
                            "3. Locas Vacaciones sobre Ruedas (2006)");
                    break;
                case 3:
                    System.out.println("Drma:\n" +
                            "1. Sueños de Libertad (1994)\n" +
                            "2. Forrest Gump (1994)\n" +
                            "3. En busca de la felicidad (2006)");
                    break;
                case 4:
                    System.out.println("Ciencia Ficcion:\n" +
                            "1. Blade Runner 2049 (2017)\n" +
                            "2. El origen (2010)\n" +
                            "3. Matrix (1999)");
                    break;
            }
        }
    }
}