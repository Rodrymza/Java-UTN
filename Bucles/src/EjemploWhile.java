import javax.swing.*;
public class EjemploWhile {
    public static void main(String[] args) {
        int intentos = 3;
        String password = "", contrasenia = "UTN";
        password = JOptionPane.showInputDialog("Ingrese su contraseña");
        intentos --;
        while (!password.equals(contrasenia) && intentos != 0) {
            password = JOptionPane.showInputDialog("Contrseña incorrecta, ingrese nuevamente\n" +
                    "le quedan " + (intentos) + " intentos");
            intentos --;
        }
        if (contrasenia.equals(password)) {
            JOptionPane.showMessageDialog(null, "Acceso correcto al sistema");
        } else {
            JOptionPane.showMessageDialog(null, "Aceceso bloqueado");
        }
    }
}
