//Guardar en un array los 20 primeros números pares
public class Ejercicio04 {
    public static void main(String[] args) {
        int[] lista_pares = new int[20];
        llenar_pares(lista_pares);
        for (int i = 0; i < lista_pares.length; i++) {
            System.out.print(lista_pares[i] + " ");
        }
    }
    public static void llenar_pares(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i*2;
        }
    }
    public static void mostrar_array_int (int[] lista) {
        for (int elemento: lista) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}
