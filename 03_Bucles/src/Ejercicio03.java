import javax.swing.*;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el total de productos");
        int valor_minimo = 5;
        String restock_necesario = "";
        int cantidad = Integer.parseInt(input.nextLine());
        String[] nombres = new String[cantidad];
        int stock[] = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre del producto");
            nombres[i] = input.nextLine();
            System.out.println("Ingrese stock de " + nombres[i]);
            stock[i] = Integer.parseInt(input.nextLine());
            if (stock[i] < valor_minimo) {
                restock_necesario += nombres[i] + " tiene menos de 5 unidades:\n";
            }
        }
        System.out.println(restock_necesario);
    }
}

