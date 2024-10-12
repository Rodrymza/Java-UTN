//Programa de horoscopo
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signo = "";
        System.out.println("Ingresa tu dia de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        int mes = sc.nextInt();

        switch (mes) {
            case 1: signo = (dia <= 19) ? "Capricornio" : "Acuario";
                break;
            case 2: signo = (dia <= 18) ? "Acuario" : "Piscis";
                break;
            case 3: signo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4: signo = (dia <= 19) ? "Aries" : "Tauro";
                break;
            case 5: signo = (dia <= 20) ? "Tauro" : "Geminis";
                break;
            case 6: signo = (dia <= 20) ? "Geminis" : "Cancer";
                break;
            case 7: signo = (dia <= 22) ? "Cancer" : "Leo";
                break;
            case 8: signo = (dia <= 22) ? "Leo" : "Virgo";
                break;
            case 9: signo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10: signo = (dia <= 22) ? "Libra" : "Escopio";
                break;
            case 11: signo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12: signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                System.out.println("Mes incorrecto");
        }

        if (signo != "") {
            System.out.println("Tu signo zodiacal es: " + signo);
        }
    }
}