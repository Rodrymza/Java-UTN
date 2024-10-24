import java.util.Random;

//Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores.
public class Ejercicio07 {
    public static void main(String[] args) {
        Random random = new Random();
        int alturas = 20, superiores = 0, inferiores = 0, suma_alturas = 0;
        int[] lista_alturas = new int[alturas];
        //creacion y suma total de arreglo
        for (int i = 0; i < lista_alturas.length ; i++) {
            lista_alturas[i] = random.nextInt(155, 196);
            suma_alturas += lista_alturas[i];
        }
        float altura_promedio = (float)suma_alturas/ lista_alturas.length;
    for (int elemento : lista_alturas) {
        if (elemento > altura_promedio) {
            superiores++;
        } else if (elemento < altura_promedio) {
            inferiores++;
        }
    }
    Ejercicio04.mostrar_array_int(lista_alturas);
        System.out.println("El promedio de altura es de " + String.format("%.2f", altura_promedio));
        System.out.println("El total de alturas superiores a la promedio es de " + superiores);
        System.out.println("El total de alturas inferires a la promedio es de " + inferiores);
    }
}
