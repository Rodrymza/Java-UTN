import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa el valor del producto");
    int precio = input.nextInt();
    double precio_iva = precio * 1.21;

    System.out.println("El precio con iva es de $" + precio_iva);
    System.out.println("El iva del producto es: $" + (precio * 0.21));
    }
}