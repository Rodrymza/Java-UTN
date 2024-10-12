//Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
//ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
//hábitos saludables basada en estos datos.

import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        int horas_saludables = 8, comidas_saludables = 3, ejercicio_saludable = 250, indice_salud = 0;
        System.out.println("Habitos Saludables");

        int horas_usuario = pedirValores("Ingresa la cantidad de horas que duermes por dia");
        int ejercicio_usuario = pedirValores("Ingrese la cantidad de minutos de ejercicio que realizas por dia");
        int comidas_usuario = pedirValores("Ingrese la cantidad de comidas saludables que realizas por dia");

        if (horas_usuario < horas_saludables) {
            System.out.println("Debes intentar dormir mas horas por dia para tener un buen descanso (Minimo 8 horas)");
        } else {
            System.out.println("Estas durmiendo las horas suficientes por dia");
            indice_salud++;
        }
        if (ejercicio_usuario * 5 < ejercicio_saludable) {
            System.out.println("Debes realizar mas ejercicio por semana (Al menos 250 min por semana)");
        } else {
            System.out.println("Realizas el ejercicio recomendado por semana");
            indice_salud++;
        }
        if (comidas_usuario < comidas_saludables) {
            System.out.println("Debes realizar mas comidas saludables por semana (Al menos 3 por dia)");
        } else {
            System.out.println("Realizas la cantidad suficiente de comidas saludables por dia");
        }

        switch (indice_salud) {
            case 0:
                System.out.println("Estado critico de habitos saludables, debes mejorar en todos los campos mencionados");
                break;
            case 1:
                System.out.println("Estado de habitos saludables regular, todavia hay mucho por mejorar");
                break;
            case 2:
                System.out.println("Estado de habitos saludables bueno, te falta muy poco para llevar una vida sana");
                break;
            case 3:
                System.out.println("Buen estado de habitos saludables! Mantente asi!");
                break;
        }
    }
    public static int pedirValores(String solicitud) {
        System.out.println(solicitud);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
