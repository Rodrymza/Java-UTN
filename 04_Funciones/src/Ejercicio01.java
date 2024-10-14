import java.util.Scanner;
public class Ejercicio01 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double ventatotal = 0;
        ventatotal = sumarVentasDiarias();
        System.out.println("El total vendido en el mes fue de $" + ventatotal);
    }
    public static double sumarVentasDiarias() {
        int dias = 30, suma = 0;
        int[] ventadiaria = new int[30];

        for (int i =01; i < dias; i++) {
            System.out.println("Ingrese la venta total del dia " + (i + 1));
            ventadiaria[i] = input.nextInt();
            suma += ventadiaria[i];
        }
        return suma;
    }
}
