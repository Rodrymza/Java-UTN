import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int[] A = new int[4];
        int[] B = new int[4];
        int[] C = new int[4];
        cargarArreglo(A);
        //mostrarArreglo(A);
        //cargarArreglo(B);
        //sumarDosArreglos(A, B, C);
        int[] numeros = {2, 4, 6 ,8};
        mostrarArreglo(numeros);
        mostrarArreglo(A);
    }

    public static void cargarArreglo(int[] arreglo) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese elemento " + (i+1));
            arreglo[i] = input.nextInt();
        }
    }
    public static int sumarArreglo(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public static void sumarDosArreglos(int[] lista1, int[] lista2, int[] lista_sumada) {
        int suma = 0;
        for (int i = 0; i < lista1.length; i++) {
        lista_sumada[i] = lista1[i] + lista2[i];
        }
    }
    public static void mostrarArreglo(int[] lista) {
        System.out.println("Elemenos en pantalla");
        for (int elemento:lista) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}
