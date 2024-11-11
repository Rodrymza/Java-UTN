package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Plato {
    private String nombreCompleto;
    private double precio;
    boolean esBebida;
    ArrayList<Ingrediente> lista_ingredientes = new ArrayList<>();

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
    }

    public Plato() {
    }

    public void pedirDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato");
        nombreCompleto = input.nextLine();
        System.out.println("Ingrese precio de " + nombreCompleto);
        precio = Double.parseDouble(input.nextLine());
        esBebida = pedirBoolean("Es una bebida?");
    }


    public boolean pedirBoolean(String mensaje) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje + " (s/n)");
            String respuesta = input.nextLine();
            switch (respuesta) {
                case "s" : return true;
                case "n" : return false;
                default:
                    System.out.println("Ingresaste una respuesta invalida");
                    continue;
            }
        }
    }
    public void anadirIngrediente() {
        while (true) {
            Ingrediente ingrediente_actual = new Ingrediente();
            ingrediente_actual.pedirDatos();
            lista_ingredientes.add(ingrediente_actual);
            if (! pedirBoolean("Desea agregar mas ingredientes?")) {
                break;
            }
        }
    }
    public void mostrarPlato() {
        System.out.println("---------------");
        System.out.println(nombreCompleto + "\n$" + precio);
        for (Ingrediente ingrediente_actual : lista_ingredientes) {
            ingrediente_actual.mostrarIngrediente();
        }
        System.out.println("---------------");
    }
}

