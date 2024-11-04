package Herencia;

abstract class Persona {
    protected String nombre;
    protected int edad;

    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }
    public abstract void estudiar();
    //definicion de metodo abstracto
    public abstract void mostrarCategoria();

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("Mi nombre es " + nombre +
                "\nMi edad es " + edad);
    }
}
