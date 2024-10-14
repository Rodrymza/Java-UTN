import java.util.Random;

public class Ejercicio07 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] compras = new double[10];
        for (int i = 0; i < compras.length; i++) {
            compras[i] = random.nextDouble(200,900);
        }
        mostrarCompras(compras);
        aplicarDescuento(compras);
    }
    public static void aplicarDescuento(double[] compras) {
        int minimo = 500;
        double descuento = 0.15;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] >= minimo) {
                compras[i] = compras[i] * (1 - descuento);
                System.out.println("Se aplico el descuento de 15%\n" +
                        "El total de la compra es de $" + String.format("%.2f" ,compras[i]));
            } else {
                System.out.println("No se aplico descuento\n" +
                        "Compra $" + String.format("%.2f", compras[i]));
            }
        }
    }
    public static void mostrarCompras(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            System.out.println("Compra " + i + " " +String.format("%.2f", compras[i]));
        }
    }
}
