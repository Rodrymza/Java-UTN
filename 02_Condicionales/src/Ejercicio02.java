//Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
//(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
//15% para jubilados. Imprime el precio final después del descuento.
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int descuento_estudiantes = 10;
        int descuento_adulto = 5;
        int descuento_jubilados = 15;
        double valor_producto, valor_final;
        double descuento_final = 0;

        System.out.println("Ingresa el precio del producto:");
        valor_producto = input.nextInt();

        System.out.println("Selecciona la categoria correspondiente");
        System.out.println("1 - Adultos");
        System.out.println("2 - Estudiantes");
        System.out.println("3 - Jubilados");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                descuento_final = descuento_adulto;
                break;
            case 2:
                descuento_final = descuento_estudiantes;
                break;
            case 3:
                descuento_final = descuento_jubilados;
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        valor_final = valor_producto * (100 - descuento_final) / 100;
        System.out.println("El valor el producto " + String.format("%.2f", valor_final));
        System.out.println("El total de descuento fue " + String.format("%.2f", (valor_producto - valor_final)));
    }
}
