//calculadora indice felicidad
import java.util.Scanner;
//satisfacción con la
//vida, nivel de estrés, nivel de salud,
public class Ejercicio07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int satisfaccion, estres, salud, trabajo, relaciones, economica;

        System.out.println("Calculadora indice de felicidad");
        System.out.println("Ingrese su nivel de satisfaccion con la vida (1-10)");
        satisfaccion = input.nextInt();

        System.out.println("Ingrese su nivel de estres(1-10)");
        estres = input.nextInt();

        System.out.println("Ingrese su nivel de salud fisico mental(1-10)");
        salud = input.nextInt();

        System.out.println("Ingrese su nivel de satisfaccion con su trabajo(1-10)");
        trabajo = input.nextInt();

        System.out.println("Ingrese su nivel de satisfaccion con sus relaciones personales(1-10)");
        relaciones = input.nextInt();

        System.out.println("Ingrese su nivel de satisfaccion con su ambito economico(1-10)");
        economica = input.nextInt();
    }
}


