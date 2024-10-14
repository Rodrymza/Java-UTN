import java.util.Random;

public class Ejercicio04 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] clientes = {"Ramirez", "Arancibia", "Morales", "Lopez", "Perez", "Zarate"};
        int[] compras = new int[clientes.length];
        for (int i = 0; i < compras.length; i++) {
            compras[i] = random.nextInt(1,15);
        }
        calcularDescuento(clientes, compras);
    }
    public static void calcularDescuento(String[] nombres, int[] compra) {
        int base_compras = 10;
        for (int i = 0; i < compra.length; i++) {
            if (compra[i] > base_compras) {
                System.out.println("Cliente: " + nombres[i] + " tiene 10% de descuento\n" +
                        "Compras totales: " + compra[i]);
            }
        }
    }
}

