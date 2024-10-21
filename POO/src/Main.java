public class Main {
    public static void main(String[] args) {
    Persona persona1 = new Persona("Rodrigo","Ramirez");
    Persona persona2 = new Persona("Rocio", "Arancibia");
    persona1.caminar();
    System.out.println(persona1.getNombre());
        System.out.println(persona2.getApellido());
    }
}