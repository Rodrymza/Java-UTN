package Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona rodry = crear_persona();
        Persona roci = crear_persona();

        rodry.mostrar_datos();
        roci.mostrar_datos();

    }
    public static Persona crear_persona() {
        System.out.println("Creando nueva persona");
        Scanner input = new Scanner(System.in);
        System.out.println();
        String nombre = pedir_string("Ingrese nombre de la persona");
        String apellido = pedir_string("Ingrese apellido de la persona");
        int documento = Integer.parseInt(pedir_string("Ingrese documento de " + nombre));
        int nacimiento = Integer.parseInt(pedir_string("Ingrese año de nacimiento"));
        String pais = pedir_string("Ingrese pais de nacimiento");
        char genero = 'a';
        while (true) {
            genero = pedir_string("Ingrese el genero de la persona (f/m)").toLowerCase().charAt(0);
            if (genero == 'f' | genero == 'm') {
                break;
            } else {
                System.out.println("Ingresaste mal el genero");
            }
        }
        Persona nueva_persona = new Persona(nombre, apellido, documento, nacimiento, pais, genero);
        return nueva_persona;
    }
    public static String pedir_string(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
}
