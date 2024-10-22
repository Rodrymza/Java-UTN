//Leer 10 enteros y mostrar la media de los valores negativos y la de los positivos.
public class Ejercicio06 {
    public static void main(String[] args) {
        int[] lista_numeros = new int[20];
        Ejercicio05.llenar_lista(lista_numeros);
        Ejercicio04.mostrar_array_int(lista_numeros);
        calcularMediaPosNeg(lista_numeros);
    }
    public static void calcularMediaPosNeg (int[] lista) {
        int positivos = 0, negativos = 0, suma_pos = 0, suma_neg = 0;
        for (int elemento: lista) {
            if (elemento > 0) {
                positivos ++;
                suma_pos += elemento;
            } else if (elemento < 0) {
                negativos ++;
                suma_neg -= elemento;
            }
        }
        suma_neg = Math.abs(suma_neg);
        System.out.println("El total de elementos positivos es " + positivos);
        System.out.println("El total de elementos negativos es " + negativos);
        System.out.println("El suma total negativos es " + suma_neg);
        System.out.println("El promedio de numeros positivos es " + String.format("%.2f", (double)suma_pos/positivos));
        System.out.println("El promedio de numeros negativos es " + String.format("%.2f", (double)suma_neg/negativos));
    }
}
