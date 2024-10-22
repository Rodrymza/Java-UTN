//Contar el número de elementos positivos, negativos y ceros en un array de 10 enteros.
import java.util.Random;
public class Ejercicio05 {
    public static void main(String[] args) {
        int[] lista_numeros = new int[10];
        llenar_lista(lista_numeros);
        Ejercicio04.mostrar_array_int(lista_numeros);
        contar_elementos(lista_numeros);
    }
    public static void llenar_lista(int[] lista) {
        Random random = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(-20, 20);
        }
    }
    public static void contar_elementos(int[] lista) {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int elemento: lista) {
            if (elemento > 0) {
                positivos ++;
            } else if (elemento < 0) {
                negativos ++;
            } else {
                ceros ++;
            }
        }
        System.out.println("La cantidad de elementos positivos es: " + positivos);
        System.out.println("La cantidad de elementos negativos es: " + negativos);
        System.out.println("La cantidad de elementos cero es: " + ceros);
    }
}
