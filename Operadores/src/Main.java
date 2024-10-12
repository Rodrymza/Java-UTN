import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a, b, c, i;

    Scanner lectura = new Scanner(System.in); //asignacion de espacio en memoria para el objeto lectura

        System.out.println("Ingrese el valor para a");
        a = lectura.nextInt();
        System.out.println("Ingrese el valor para b");
        b = lectura.nextInt();
        System.out.println("Ingrese el valor para c");
        c = lectura.nextInt();
        i = 1;

        //Diferencia entre contadores ++i y i++
        a = a + (++i);
        System.out.println("El valor de a es "+ a + " ++i");

        a = a + (i++);
        System.out.println("El valor de a es de " + a + " i++");

        b = b + (--i);
        System.out.println(("El valor de b es " + b) + " --i");

        b = b + (i--);
        System.out.println(("El valor de b es " + b) + " i--");

    }
}