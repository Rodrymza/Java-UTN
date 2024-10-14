import java.util.Scanner;

public class EjemploMetodo {
    public static void main(String[] args) {
        int num1, num2;
        imprimirHola("Rodri");
        num1 = leerNumero();
        num2= leerNumero();
        System.out.println("La suma de ambos numeros es " + sumarNumeros(num1, num2));
    }
    //procedimiento (no retorna un valor)
    public static void imprimirHola(String nombre) {
        System.out.println("Hola! " + nombre);
    }
    //fucion con retorno
    public static int sumarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static int leerNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = input.nextInt();
        return numero;
    }
}
