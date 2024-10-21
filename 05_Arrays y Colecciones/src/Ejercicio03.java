import java.util.Random;

//Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo.
// Mostar los alumnos con notas superiores a la media.
public class Ejercicio03 {
    public static void main(String[] args) {
        int[] notas_alumnos = new int[25];
        completarNotas(notas_alumnos);
        System.out.println("El promedio de notas de todos los alumnos es: " + calcularPromedio(notas_alumnos));
        mostrarAlumnosPromedioSup(notas_alumnos, calcularPromedio(notas_alumnos));
    }
    public static void completarNotas(int[] notas) {
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(4,10);
        }
    }
    public static double calcularPromedio(int[] lista) {
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        promedio = suma / lista.length;
        return  promedio;
    }
    public static void mostrarAlumnosPromedioSup(int[] lista, double promedio) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]> promedio) {
                System.out.println("Alumno " + i + " con nota superior al promedio: " + lista[i]);
            }
        }
    }
}
