import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Arreglos y colecciones
public class Main {
    public static void main(String[] args) {
    int[] numers = {1, 2, 3, 4, 5, 6};
    String[] nombres = new String[4];
    int[] numeros_pares = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numeros_pares.length; i++) {
            numeros_pares[i] = i*2;
        }
        for (int i = 0; i < numeros_pares.length; i++) {
            System.out.print(numeros_pares[i] + " ");
            System.out.println("");
        }
        System.out.println("El promedio de esta lista es " + promedio(numeros_pares));
    int[] Notas = new int[4];
        cargarArreglo(Notas);
        System.out.println("El promedio de las notas ingresadas es " + promedio(Notas));
    }

    public static double promedio(int[] lista ) {
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        return suma/ (double) lista.length;
    }

    public static void cargarArreglo(int[] lista) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese valor " + (i+1));
            lista[i] = input.nextInt();
        }
    }
}