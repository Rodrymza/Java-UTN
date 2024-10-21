public class Persona {
    private String nombre;
    private String apellido;
    //deben crearse los dos construtores de clase, el vacio y el sobrecargado:

    public Persona() { //constructor vacio
    }
    public Persona(String nombre, String apellido) { //constructor sobrecargado
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//Alt + Insert para getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void caminar() {
        System.out.println(nombre + " esta caminando");
    }
    public static void main(String[] args) {
    Persona rodry = new Persona("Rodrigo", "Ramirez");
    rodry.caminar();
    }
}
