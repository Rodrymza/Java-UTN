package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> lista_alumnos = new ArrayList<>();
        anadir_alumno(lista_alumnos);
        for (Alumno alumno_actual : lista_alumnos) {
            alumno_actual.mostrarNotas();
        }


    }
    public static void anadir_alumno(ArrayList lista_alumnos){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese nombre del alumno");
            String nombre = input.nextLine();
            System.out.println("Ingrese numero de legajo");
            long legajo = input.nextLong();
            Alumno alumno_agregar = new Alumno(legajo, nombre);
            alumno_agregar.anadirNota_manual();
            lista_alumnos.add(alumno_agregar);
            if (! preguntar("Desea agregar mas alumnos?")) {
                break;
            }
        }
    }
    public static boolean preguntar(String mensaje) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(mensaje);
            String respuesta = input.nextLine();
            switch (respuesta) {
                case "s": return true;
                case "n": return false;
                default:
                    System.out.println("Respuesta incorrecta");
                    break;
            }
        }
    }
}