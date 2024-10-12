import javax.swing.*;

public class OperdoresSwing {
    public static void main (String[] args){
    String nombre;
    int numero1, numero2;
    double numero3;

    //el tipo de dato simepre entra como tipo Sting
    nombre = JOptionPane.showInputDialog("Ingrese su nombre");

    //para convertirlo a tipo int hay que usar el metodo parseInt
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    numero3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero"));  //numero tipo doble, largo

    JOptionPane.showMessageDialog(null, "El numero 1 es " + numero1 );  //no hay parentcomponent entonces se usa null
    JOptionPane.showMessageDialog(null, "El nombre que ingresaste es " + nombre );

    }
}

