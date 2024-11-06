package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlumnos {
    private ArrayList<Alumno> lista_alumnos = new ArrayList<>();

    public GestionAlumnos() {
    }

    public void anadir_alumno() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese nombre del alumno");
            String nombre = input.nextLine();
            System.out.println("Ingrese numero de legajo");
            long legajo = input.nextLong();
            Alumno alumno_agregar = new Alumno(legajo, nombre);
            alumno_agregar.anadirNota_manual();
            lista_alumnos.add(alumno_agregar);
            if (!preguntar("Desea agregar mas alumnos?")) {
                break;
            }

        }
    }
    public void listaNotas() {
        for (Alumno alumno : lista_alumnos) {
            System.out.println("------------------------");
            alumno.mostrarNotas();
        }
    }
    public static boolean preguntar(String mensaje) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(mensaje);
            String respuesta = input.nextLine();
            switch (respuesta) {
                case "s":
                    return true;
                case "n":
                    return false;
                default:
                    System.out.println("Respuesta incorrecta");
                    break;
            }
        }
    }
    public void listarNombres() {
        int contador = 1;
        for (Alumno alumno_actual: lista_alumnos) {
        System.out.println(contador + " - " + alumno_actual.getNombre());
        contador ++;
        }
    }
}