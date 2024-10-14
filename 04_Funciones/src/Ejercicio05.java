
package pkg04_funciones;

import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        int[] calificacion = new int[8];
        Random random = new Random();
        
        for (int i = 0; i < calificacion.length; i++) {
            calificacion[i] = random.nextInt(1,6);
            System.out.println("Calificacion cliente " + i + ": " + calificacion[i]);
        }
                    calcularPromedio(calificacion);

    }
    public static void calcularPromedio(int[] calificacion) {
        double suma = 0.0;
        for (int i = 0; i < calificacion.length; i++) {
                  suma += calificacion[i];
        }
        double promedio = suma / calificacion.length;
        System.out.println("El promedio de satisfaccion es de: " + String.format("%.2f", promedio));
    }
}
