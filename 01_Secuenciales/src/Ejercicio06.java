//Generador de planes de estudio
import javax.swing.*;

public class Ejercicio06 {
    public static void main(String[] args) {
    int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas por dia \n" +
            "que puedes estudiar"));

    if (horas <2 ) {
        //plan de estudio menos de 2 horas
    }
    else if (horas > 2 && horas < 4){
        //plan de estudio menos de 4 horas
    }
    else {
        //plan de estudio mas de 4 horas
    }
    }
}
