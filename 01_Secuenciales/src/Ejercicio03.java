//Ejercicio03 Generador rutinas de ejercicio

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nivel de su condicion fisica");
        System.out.println("1 Principiante");
        System.out.println("2 Intermedio");
        System.out.println("3 Avanzado");

        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Nivel Principiante:\n" +
                        "1. Calentamiento:\n5 minutos de caminata ligera o saltos suaves.\\n2. Ejercicios:\n" +
                        "Sentadillas: 3 series de 10 repeticiones.\n" +
                        "Flexiones de brazos (pueden ser de rodillas): 3 series de 10 repeticiones.\n" +
                        "Abdominales (crunches): 3 series de 15 repeticiones.\n" +
                        "3. \nEnfriamiento: 5 minutos de estiramientos suaves.");
                break;
            case 2:
                System.out.println("Nivel Intermedio:\n" +
                        "1. Calentamiento:\n 5-10 minutos de trote ligero o saltos. \n2. Ejercicios:\n" +
                        "Sentadillas con peso (puede ser una mancuerna en cada mano): 3 series de 12 repeticiones.\n" +
                        "Flexiones de brazos: 3 series de 15 repeticiones.\n" +
                        "Abdominales (plancha): 3 series de 45 segundos.\n" +
                        "Zancadas (lunges): 3 series de 12 repeticiones por pierna." +
                        "\n3. Enfriamiento: 5-10 minutos de estiramientos.");
                break;
            case 3:
                System.out.println("Nivel Avanzado:\n" +
                        "Calentamiento:\n 10-15 minutos de trote ligero o saltos.\\n2. Ejercicios:\n" +
                        "Sentadillas con peso (barra o mancuernas pesadas): 4 series de 15 repeticiones.\n" +
                        "Flexiones de brazos (pueden ser variaciones como flexiones diamante): 4 series de 20 repeticiones.\n" +
                        "Abdominales (plancha lateral): 4 series de 1 minuto por lado.\n" +
                        "Zancadas con peso (lunges con mancuernas): 4 series de 15 repeticiones por pierna.\n" +
                        "Burpees: 4 series de 15 repeticiones.\n" +
                        "Enfriamiento: 10-15 minutos de estiramientos profundos.");
                break;
            default:
                System.out.println("Opcion no valida");
                System.out.println("Ingrese la condicion fisica (1-3)");
                opcion = input.nextInt();
        }
    }
}
