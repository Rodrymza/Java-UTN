package Herencia;

public class Profesor extends Persona implements Volador{
    private String titulo;

    public Profesor(String nombre, int edad, String titulo) {
        super(nombre, edad);
        this.titulo = titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void estudiar() {
        System.out.println(nombre + " esta estudiando como profesor");
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Soy profesor");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando");
    }
}

