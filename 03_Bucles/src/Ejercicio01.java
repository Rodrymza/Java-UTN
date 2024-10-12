import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String[] actividades = {"estudiar", "hacer ejercicio", "leer", "tiempo libre"};
    int indice_tiempolibre = 3;
    int[] horas = {0, 0, 0, 0};
    int horastotales = 0;

        for (int i = 0; i < actividades.length; i++) {
            System.out.println("Ingresa las horas que ocupas en " + actividades[i]);
            horas[i] = input.nextInt();
            horastotales += horas[i];

        }
        for (int i = 0; i < horas.length; i++) {
            System.out.println("Tiempo usado en " + actividades[i] + ": " + horas[i]);
        }
        System.out.println("Tiempo total dedicado: " + (horastotales - horas[indice_tiempolibre]));
    }
}