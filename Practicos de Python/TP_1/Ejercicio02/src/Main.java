//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println("Ingresa tu nombre");
        String nombre = input.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = input.nextInt();

        System.out.println("Bienvenido " + nombre);
         if (edad > 18) {
             System.out.println("Eres mayor de edad");
        }
         else {
             System.out.println("Eres menor de edad");
         }
        }
    }
