import java.util.Scanner;
public class Condicional1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String examen = "Aprobado";

        System.out.println("Ingresa tu edad");
        int edad = input.nextInt();

        if (edad > 18 && examen.equals("Aprobado")) {
            System.out.println("Habilitado par sacar el carnet");
        }
        else {
            System.out.println("No habilitado para sacar el carnet");
        }
    }
}
