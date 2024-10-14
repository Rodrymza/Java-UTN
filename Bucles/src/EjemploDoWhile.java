import java.util.Random;
import java.util.Scanner;
public class EjemploDoWhile {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        Random numRandom = new Random();
        int nota, intentos = 0;
        do {
            nota = numRandom.nextInt(1,10);
            //System.out.println("Ingresa la nota que sacaste");
            System.out.println("Nota sacada: " + nota);
            //nota = Integer.parseInt(imput.nextLine());
            intentos++;
            if (nota > 5) {
                System.out.println("Aprobaste");
            } else {
                System.out.println("Desaprobaste, te quedan " + (4 - intentos) + " intentos");
            }
        } while (intentos < 4 && nota < 6);

    }
}
