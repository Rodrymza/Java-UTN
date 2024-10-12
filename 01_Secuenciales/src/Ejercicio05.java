//ejercicio05 costo del viaje

import javax.swing.*;
public class Ejercicio05 {
    public static void main(String[] args) {
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia en km"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del combustible"));
        double consumo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el consumo de combustible (lts por 100 km)"));

        double totalconsumido = (distancia / consumo * precio);

        JOptionPane.showMessageDialog(null,"El total a gastar sera de $" + String.format("%.2f", totalconsumido));
    }
}
