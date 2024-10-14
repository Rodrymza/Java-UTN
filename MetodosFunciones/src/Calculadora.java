public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Suma :" +sumar(5,8));
        System.out.println("Resta: " +restar(5,8));
        System.out.println("Division: " + dividir(5,8));
        System.out.println("Multiplicacion: " +multiplicar(5,8));
        System.out.println("Resto: " + resto(5,8));
    }
    public static int sumar(int a, int b) {
        return a+b;
    }
    public static int restar(int a, int b) {
        return a-b;
    }
    public static int multiplicar(int a, int b) {
        return a*b;
    }
    public static double dividir(double a, double b) {
        return a/b;
    }
    public static int resto(int a, int b) {
        return a%b;
    }
}
