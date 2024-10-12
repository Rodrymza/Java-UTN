public class Probando {
    String atributo = "Caminar";
    private String nombre;
    private int edad;
    public Probando(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Probando objeto = new Probando("Rodrigo", 33);
        saludarNombre("Rodrigo");

        objeto.imprimirAtributo();
        objeto.saludarObjeto();
    }

    //funcion sin retorno
    public static void saludar() {
        System.out.println("Hola! Como estas?");
    }

    //funcion con paso de parametros
    public static void saludarNombre(String nombre) {
        System.out.println("Hola " + nombre + "! Como va?");
        System.out.println("Accediento al atributo de la clase ");
    }

    //funcion con retorno
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    //metodo no estatico para acceer a un atributo de la clase
    public void  imprimirAtributo() {
        System.out.println("Nombre :" + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Este es el atributo de la clase: " + atributo);
    }
    public void saludarObjeto () {
        System.out.println("Hola! " + this.nombre);
    }
}
