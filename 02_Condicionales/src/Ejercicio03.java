//Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
//ciencia ficción) y luego recomiende un libro basado en su elección

import javax.swing.*;
public class Ejercicio03 {
    public static void main(String[] args) {

    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona tu genero favorito \n" +
            "1 Fantasia \n2 Misterio \n3 Romance \n4 Ciencia Ficcion"));

    switch (opcion) {
        case 1:
            JOptionPane.showMessageDialog(null, "El señor de los Anillos: La Comunidad del Anillo - J. R. R. Tolkien");
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "Secretos imperfectos - Hans Rosenfeldt");
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "El dia que dejo de nevar en Alaska - Alice Kellen");
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "El talisman - Stephen King");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
    }
    }
}
