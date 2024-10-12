import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int numero = 0;
    Scanner input = new Scanner(System.in);
    do {
        System.out.println("Ingresa un numero mayor a 0");
        numero = input.nextInt();
        if (numero == 0) {
            System.out.println("El numero debe ser distinto a 0");
        }
    } while (numero == 0);
    System.out.println("El numero ingresado es " + numero);
    }
}