package Persona;

public class Persona {
    private String nombre;
    private String apellido;
    private int documento;
    private int nacimiento;
    private String pais;
    private char genero;

    public Persona(String nombre, String apellido, int documento, int nacimiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.genero = genero;
    }

    public Persona() {
    }
    public void mostrar_datos() {
        System.out.println("Nombre y apellido: " + apellido + ", " + nombre);
        System.out.println("DNI: " + documento);
        System.out.println("Año nacimiento: " + nacimiento);
        System.out.println("Pais de nacimiento: " + pais);
        System.out.println("Genero: " + genero);
    }
}
