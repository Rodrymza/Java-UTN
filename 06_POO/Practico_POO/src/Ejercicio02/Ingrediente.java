package Ejercicio02;

import java.util.Scanner;

public class Ingrediente {
    String nombre;
    double cantidad;
    String unidadDeMedida;

    public Ingrediente(String nombre, double cantidad, String unidadDeMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
    }

    public Ingrediente() {
    }
    public void pedirDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del ingrediente");
        nombre = input.nextLine();
        System.out.println("Ingrese cantidad de " + nombre);
        cantidad = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese unidad de medida");
        unidadDeMedida = input.nextLine();
    }
    public void mostrarIngrediente() {
        System.out.println(cantidad + " " + unidadDeMedida + " de " + nombre);
    }
}
