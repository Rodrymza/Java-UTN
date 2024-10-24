import java.util.Random;

//
public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = crearMatriz(3);
        Ejercicio10.mostrarMatriz(matriz);
        System.out.println("Trasponer matriz");
        int[][] matriz_traspuesta = trasponerMatriz(matriz);
        Ejercicio10.mostrarMatriz(matriz_traspuesta);
    }
    public static int[][] crearMatriz(int tamanio) {
        int[][] matriz = new int[tamanio][tamanio];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(0, 100);
            }
        }
        return matriz;
    }
    public static int[][] trasponerMatriz (int[][] matriz) {
        int[][] matriz_traspuesta = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz_traspuesta.length; i++) {
            for (int j = 0; j < matriz_traspuesta.length; j++) {
                matriz_traspuesta[i][j] = matriz[j][i];
            }
        }
        return matriz_traspuesta;
    }

}
