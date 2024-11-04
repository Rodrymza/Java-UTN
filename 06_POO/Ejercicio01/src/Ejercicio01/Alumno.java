package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private long legajo;
    private ArrayList<Nota> lista_notas = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public long getLegajo() {
        return legajo;
    }

    public Alumno(long legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }
    public void anadirNota(Nota nota) {
        lista_notas.add(nota);
    }
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre);
        for (Nota nota: lista_notas) {
            System.out.println(nota.getCatedra() + ": " + nota.getNotaExamen());
        }
    }
    public void anadirNota_manual() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese nombre de la catedra");
            String nombre = input.nextLine();
            System.out.println("Ingrese nota");
            int nota = Integer.parseInt(input.nextLine());
            Nota nota_anadir = new Nota(nombre, nota);
            anadirNota(nota_anadir);
            if (! Main.preguntar("Desea añadir mas notas?")) {
                break;
            }
        }
    }
}
