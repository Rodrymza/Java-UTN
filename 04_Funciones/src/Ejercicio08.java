import java.util.Random;

public class Ejercicio08 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] empleados = {"Gonzalez", "Ramirez", "Morales", "Perez", "Fernandez", "Zabaleta", "Saucedo"};
        int[] horas_trabajadas = new int[empleados.length];
        for (int i = 0; i < horas_trabajadas.length; i++) {
            horas_trabajadas[i] = random.nextInt(60,96);
        }
        int[] pago_semanal = calcularPagoSemanal(empleados, horas_trabajadas);
    }
    public static int[] calcularPagoSemanal (String[] nombres, int[] horas) {
        int[] pago_semana = new int [horas.length];
        int valor_hora = 15;
        for (int i = 0; i < nombres.length; i++) {
            pago_semana[i] = horas[i] * valor_hora;
            System.out.println("Empleado: " + nombres[i] + " $" + pago_semana[i]);
            System.out.println("Horas trabajadas: " + horas[i]);
        }
        return pago_semana;
    }
}
