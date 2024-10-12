import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su estado de animo");
        System.out.println("1 Feliz");
        System.out.println("2 Triste");
        System.out.println("3 Energico");
        System.out.println("4 Relajado");

        int opcion = input.nextInt();

        while (opcion > 4 || opcion <1) {
            switch (opcion) {
                case 1: //feliz
                    break;
                case 2: //triste
                    break;
                case 3: //energico
                    break;
                case 4: //relajado
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("Ingrese la estado de animo (1-4)");
                    opcion = input.nextInt();
            }
        }
    }
}
