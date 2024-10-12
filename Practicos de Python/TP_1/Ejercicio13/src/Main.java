//verificar si el numero ingresado es primo
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int numero = 0, raizCuadrada, i, divisores=0;
    Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        numero = input.nextInt();

    if (numero <= 1 && numero >= 0) {
        System.out.println("No es un numero primo");    }
    else if (numero == 2){
        System.out.println("Es un numero primo");
        }
    else {
        raizCuadrada = (int) Math.sqrt(numero);
        for (i = 2; i <= raizCuadrada; i++ ) {
            if (numero % i == 0) {
                divisores++;
                break;
            }
        }
        if (divisores>0) {
            System.out.println("No es numero primo");
        }
        else {
            System.out.println("Es un numero primo");
        }
    }
    }
}