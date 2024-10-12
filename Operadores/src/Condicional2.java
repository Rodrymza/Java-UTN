//condicional multiple
import java.util.Scanner;
import  javax.swing.*;
public class Condicional2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion \n" +
                "1 Cafe con tortitas\n" +
                " 2 Cafe con facturas \n" +
                " 3 Cafe con tostado"));
        //System.out.println("Seleccione un elemento del menu");
        //System.out.println("1 Cafe con tortitas");
        //System.out.println("2 Cafe con facturas");
        //System.out.println("3 Cafe con tostado");
        //int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                //System.out.println("Seleccionado cafe con tortitas");
                JOptionPane.showMessageDialog(null,"Cafe con tortitas \n $3000");
                break;
            case 2:
                //System.out.println("Seleccionado cafe con facturas");
                JOptionPane.showMessageDialog(null,"Cafe con facturas \n $3300");

                break;
            case 3:
                //System.out.println("Seleccionado cafe con tostado");
                JOptionPane.showMessageDialog(null,"Cafe con tortitas \n $4000");
                break;
            default:
                //System.out.println("Opcion no valida");
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
}
