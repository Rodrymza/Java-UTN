package Ejercicio01;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 15);
        Curso c1 = new Curso("Matematica");
        p1.setCurso(c1);
        System.out.println(p1.getNombre() + " esta cursando " + p1.getCurso().getNombre());
        Auto auto1 = new Auto("VW");
        Auto auto2 = new Auto("Peugeot");
        Auto auto3 = new Auto("Fitito, un caño");
        p1.anadirAuto(auto1);
        p1.anadirAuto(auto2);
        p1.mostrarautos();
        p1.mostrarCurso(); //metodo para mostrar curso
    }
}
