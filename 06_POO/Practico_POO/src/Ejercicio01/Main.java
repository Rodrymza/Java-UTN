package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    GestionAlumnos app = new GestionAlumnos();
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("Ingrese la opcion deseada\n1 Agregar alumno\n" +
                "2 Mostrar notas\n3 Lista de alumnos\n4 Salir");
        String opcion = input.nextLine();
        switch (opcion) {
            case "1" : app.anadir_alumno();
            break;
            case "2": app.listaNotas();
            break;
            case "3": app.listarNombres();
            break;
            case "4": break;
            default:
                System.out.println("Opcion invalida");
                continue; //para que salga directamente al inicio del while
        }
        if (opcion.equals("4")) {
            break;
        }
    }

    }
}