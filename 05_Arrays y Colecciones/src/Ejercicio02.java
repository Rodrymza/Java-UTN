//Leer 10 números enteros por teclado y guardarlos en un array.
//Calcula y muestra la media de los números que estén en las posiciones pares del array.
public class Ejercicio02 {
    public static void main(String[] args) {
    int[] numeros = {7, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("El promedio de los numeros en posiciones\n" +
                " pares del array es " + mediaNumPares(numeros));
    }
    public static double mediaNumPares(int[] lista) {
        int suma = 0;
        int contador = 0;
        double promedio = 0;
        for (int i = 0; i < lista.length; i+=2) {
            suma += lista[i];
            contador ++;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Contador: " + contador);
        promedio = (double) suma / contador;
        return promedio;
    }
}
