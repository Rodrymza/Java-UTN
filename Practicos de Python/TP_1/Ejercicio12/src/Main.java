import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int dia=0;
    Scanner input = new Scanner(System.in);

    while (dia < 1 || dia > 7) {
        System.out.println("Ingresa un dia de la semana(1-7)");
        dia = input.nextInt();

    switch (dia) {
        case 1, 2, 3, 4, 5:
            System.out.println("Dia laborable");
            break;
        case 6, 7:
            System.out.println("Fin de semana");
            break;
        default:
            System.out.println("Dia incorrecto");

        }
    }
    }
}
