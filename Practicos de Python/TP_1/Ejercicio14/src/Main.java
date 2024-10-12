
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int numero = random.nextInt(100), contador = 0, usuario = 101;
        System.out.println("El numero creado es " + numero);

        while (numero != usuario) {
            System.out.println("Ingresa un numero");
            usuario = input.nextInt();

            if (usuario > numero) {
                contador ++;
                System.out.println("Te pasaste, el numero es menor");
            }
            else {
                System.out.println("Te quedaste corto, el numero es mayor");
                contador++;
            }
        }
        System.out.println("Adivinaste, te llevo " + contador + " intentos");
    }
}