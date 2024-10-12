import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Ingresa tu nombre");
        nombre = input.nextLine();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
}
