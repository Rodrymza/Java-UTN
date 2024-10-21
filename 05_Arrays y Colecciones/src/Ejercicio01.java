//Calcular la media de una serie de números que se leen por teclado.
public class Ejercicio01 {
    public static void main(String[] args) {
        int[] lista = {2, 3, 5, 2, 8};

        System.out.println("La suma de todos los elementos es " + sumarArray(lista));
    }
    public static int sumarArray(int[] lista) {
        int suma = 0;
        for (int elmento : lista) {
            suma += elmento;
        }
        return suma;
    }
}