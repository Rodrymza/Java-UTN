package Herencia;

public class Estudiante extends Persona {
    private int legajo;

    public Estudiante(String nombre, int edad, int legajo) {
        super(nombre, edad);    //indica que el constructor tiene caracteristicas de la clase padre
        this.legajo = legajo;   //legajo es el unico atributo de la clase
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    @Override   //notacion que indica que se sobreescribira el metodo abstracto
    public void estudiar() {
        System.out.println(nombre + " esta estudiando como alumno");
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Soy estudiante");
    }
}
