//Registro de ventas semanales
import javax.swing.*;
public class Ejercicio04 {
    public static void main(String[] args) {
        int dias = 7, suma = 0;
        String[] nombres = {"Lunes", "Martes", "Miercoles", "Jueves",
                "Viernes", "Sabado", "Domingo"};
        for (int i = 0; i < dias; i++) {
            suma += Integer.parseInt(JOptionPane.showInputDialog("Ingrese ventas del dia " + nombres[i]));
        }
        JOptionPane.showMessageDialog(null, "El total vendido de la semana fue $" + suma);
    }
}
