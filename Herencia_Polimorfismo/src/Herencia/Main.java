package Herencia;

public class Main {
    public static void main(String[] args) {
    Estudiante alumno1 = new Estudiante("Rodrigo", 33, 411);
    alumno1.mostrarDatos();
    alumno1.estudiar();
    Profesor profe1 = new Profesor("Osvaldo", 45, "Licenciado en Matematica");
    profe1.estudiar();
    profe1.mostrarDatos();

    }
}
