//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//recomiende una actividad basada en su estado de ánimo.

import javax.swing.*;
public class Ejercicio07 {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog("Seleccione su estado de animo\n" +
                "1 - Feliz \n2 - Triste \n3 - Energico \n4 - Relajado");
        switch (opcion) {
            case "1":
                JOptionPane.showMessageDialog(null,"Actividades para estado de animo Feliz: \n1. Salir a pasear por un parque o playa.\n " +
                        "2. Compartir una comida con amigos o familiares.\n" +
                        "3. Practicar un hobby que disfrutes, como pintar o tocar un instrumento.");
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"Actividades para estado de animo Triste: \n1. Escribir en un diario para expresar tus sentimientos.\n" +
                        "2. Ver una película o serie que te haga reír.\n" +
                        "3. Hablar con un amigo cercano o un terapeuta.");
                break;
            case "3":
                JOptionPane.showMessageDialog(null,"Actividades para estado de animo Energico: \n1. Leer un libro en un lugar tranquilo.\n" +
                        "2. Tomar un baño caliente con sales o aceites esenciales.\n" +
                        "3. Practicar meditación o yoga.");
                break;
            case "4":
                JOptionPane.showMessageDialog(null,"Actividades para estado de animo Relajado: \n1. Hacer ejercicio, como correr o ir al gimnasio.\n" +
                        "2. Participar en una actividad al aire libre, como senderismo o ciclismo.\n" +
                        "3. Iniciar un proyecto creativo, como una manualidad o una obra de arte.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        }
    }
}
