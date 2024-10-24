import java.util.Random;

//Llenar un array con numeros aleatorios
public class Ejercicio09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lista_numeros = new int[20];
        for (int i = 0; i < lista_numeros.length; i++) {
            lista_numeros[i] = random.nextInt(0, 100);
            System.out.print(lista_numeros[i] + " ");

        }
    }
}
