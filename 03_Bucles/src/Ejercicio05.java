//Calculo horas extras
import javax.swing.*;
public class Ejercicio05 {
    public static void main(String[] args) {
        int total_empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de empleados"));
        String[] nombres = new String[total_empleados];
        String empleados_horas_extras = "";
        int jornada = 40, horas_extras = 0;
        int[] horas_trabajadas = new int[total_empleados];

        for (int i = 0; i < total_empleados; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre del empleado");
            horas_trabajadas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas de " + nombres[i]));
            if (horas_trabajadas[i] > jornada) {
                horas_extras = horas_trabajadas[i] - jornada;
                empleados_horas_extras += nombres[i] + " trabajo " + horas_extras + " horas extras\n";
            }
        }
        JOptionPane.showMessageDialog(null, empleados_horas_extras);
    }
}
