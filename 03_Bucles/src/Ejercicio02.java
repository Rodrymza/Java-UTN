import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tarifa = 15;
        System.out.println("Ingresa el total de empleados");
        int cantidad_empleados = Integer.parseInt(input.nextLine());
        for (int i = 0; i < cantidad_empleados; i++) {
            System.out.println("Ingresa nombre del empleado:");
            String nombre = input.nextLine();
            System.out.println("Ingresa las horas trabajadas de " + nombre);
            int horas = Integer.parseInt(input.nextLine());
            int total = horas * tarifa;
            System.out.println("El salario a pagar será de $" + total);

        }
    }
}
