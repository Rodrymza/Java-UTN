import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String pass = "huevos1", userPass = "";
    int count = 3;
    Scanner sc = new Scanner(System.in);

    do {
        System.out.println("Ingresa la contraseña");
        userPass = sc.nextLine();
        count--;
        if (!pass.equals(userPass)) {
          System.out.println("Te quedan " + count + " intentos");
        }
    } while (count != 0 && !pass.equals(userPass));
    if (pass.equals(userPass)) {
        System.out.println("Acceso correcto");
    }
    else {
        System.out.println("Usuario bloqueado");
    }
}
}