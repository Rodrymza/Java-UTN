public class Ejercicio02 {
    public static void main(String[] args) {
        String[] nombres = {"Televisor", "DVD", "Parlante bluetooth", "Notebook", "Impresora"};
        int[] stock = {8, 3, 6, 2, 10};
        generarReporte(nombres, stock);
    }
    public static void generarReporte(String[] nombres, int[] stock) {
        int minimo = 5;
        for (int i = 0; i < nombres.length; i++) {
            if (stock[i] <5) {
                System.out.println("El producto " + nombres[i] + " tiene menos de \n" +
                        "5 productos en el inventario (" + stock[i] + ")");
            }
        }
    }
}
