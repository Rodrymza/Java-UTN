package Ejercicio01;

import java.sql.Array;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private Curso curso;
    private ArrayList<Auto> autos = new ArrayList<>();

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void anadirAuto(Auto autos) {
        this.autos.add(autos);
    }

    public Persona(String nombre, int edad) { //constructor sobrecargado
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona() {  //constructor vacio, este Intellij lo hace automaticamente
    }

    public void caminar() {
        System.out.println(this.nombre + " esta caminando");
    }
    //metodos para acceder a los atributos desde otra clase ya que los atributos son privados
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //metodo para mostrar atributos
    public void mostrarautos() {
        System.out.println("Lista de autos");
        for (Auto auto: autos) {
            System.out.println(auto.getMarca());
        }
    }
    public void mostrarCurso() {
        System.out.println(nombre + " esta cursando " + getCurso().getNombre());
    }
}
