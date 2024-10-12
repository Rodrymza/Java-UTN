//Ejercicio02 Calorias
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu peso en kg");
        int peso = sc.nextInt();
        double constante_ejercicio = 0.0175;
        double met = 0;

        System.out.println("Ingresa la duracion del ejercicio en miutos");
        int duracion = sc.nextInt();
        System.out.println("Selecciona el tipo de ejercicio");
        System.out.println(("1 - Correr"));
        System.out.println(("2 - Ciclismo"));
        System.out.println(("3 - Natacion"));

        int seleccion = sc.nextInt();
        while (seleccion > 3 || seleccion <1 ) {
            System.out.println("Opcion incorrecta");
            seleccion = sc.nextInt();
        }
        switch (seleccion) {
            case 1:
                met = 8.3;
                break;
            case 2:
                met = 7.5;
                break;
            case 3:
                met = 5.8;
        }
        double calorias = constante_ejercicio * met * peso * duracion;
        System.out.println("Quemaste " + calorias + " calorias durante el ejercicio");
    }
}
