
import java.util.Random;

//calculo de impuestos
public class Ejercicio06 {
    public static void main(String[] args) {
        double[] facturas = new double[10];
        Random random = new Random();
        for (int i = 0; i < facturas.length; i++) {
            facturas[i] = random.nextDouble(200,800);
        }
        calcularImpuesto(facturas);
    } 
    public static void calcularImpuesto(double[] facturas) {
     double total_impuesto;
     double impuesto = 0.21;
        for (int i = 0; i < facturas.length; i++) {
            total_impuesto = facturas[i] * impuesto;
            System.out.println("Factura " + i + " $" + String.format("%.2f", facturas[i]) + "\n" +
                    "\tTotal impuesto $" + String.format("%.2f", total_impuesto) + "\n" +
                    "\tTotal a pagar " + String.format("%.2f", (total_impuesto + facturas[i])));
        }
    }
       }