import java.util.Random;

//sumar dos matrices
public class Ejercicio10 {
    public static void main(String[] args) {
        int tamanio = 3;
        int[][] matriz_uno = new int[tamanio][tamanio];
        int[][] matriz_dos = new int[tamanio][tamanio];
        int[][] matriz_sumada = {};
        llenarMatriz(matriz_uno);
        llenarMatriz(matriz_dos);
        System.out.println("Matriz 1");
        mostrarMatriz(matriz_uno);
        System.out.println("Matriz 2");
        mostrarMatriz(matriz_dos);
        matriz_sumada = sumar_matrices(matriz_uno, matriz_dos);
        System.out.println("Matriz sumada");
        mostrarMatriz(matriz_sumada);
    }
    public static void llenarMatriz (int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(0,20);;
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] sumar_matrices(int matriz_uno[][], int matriz_dos[][]) {
            int[][] matriz_sumada = new int[matriz_uno.length][matriz_uno.length];
            for (int i = 0; i < matriz_dos.length; i++) {
                for (int j = 0; j < matriz_dos.length; j++) {
                    matriz_sumada[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                }
            }

        return matriz_sumada;
    }
}
