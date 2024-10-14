import java.util.Random;

public class Ejercicio03 {
    public static void main(String[] args) {
        Random random = new Random();
    String[] clientes = {"Ramirez", "Arancibia", "Morales", "Lopez", "Perez", "Zarate"};
    int[] facturas_pendientes = new int[clientes.length];
        for (int i = 0; i < clientes.length; i++) {
            facturas_pendientes[i] = random.nextInt(300,600);
            System.out.println(clientes[i] + ": $" + facturas_pendientes[i]);
        }
        enviarFacturas(clientes, facturas_pendientes);
    }
    public static void enviarFacturas(String[] nombres, int[] montos) {
        int minimo = 500;
        for (int i = 0; i < nombres.length; i++) {
            if (montos[i] > minimo) {
                System.out.println("El cliente " + nombres[i] + " tiene deuda mauor a $500 ");
                System.out.println("Debe $" + montos[i]);
            }
        }
    }

}
