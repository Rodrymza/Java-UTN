//Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
//elige una opción al azar y determina quién gana. Imprime el resultado del juego.

import javax.swing.*;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        Random random = new Random();
        String resultado = "", ingreso;
        int ganados_usuario = 0, ganados_pc = 0;
        int opcion_usuario = 0;
        while (opcion_usuario != 4) {
            ingreso = JOptionPane.showInputDialog("Selecione:\n" +
                    "1 Piedra\n 2 Papel\n 3 Tijera \n 4 Salir");
            if (ingreso != null) {
                opcion_usuario = Integer.parseInt(ingreso);
            } else {
                opcion_usuario = 4;
            }

            while (opcion_usuario < 1 || opcion_usuario > 4) {
                ingreso = JOptionPane.showInputDialog("Valor incorrecto! \n Selecione:\n" +
                        "1 Piedra\n 2 Papel\n 3 Tijera \n 4 Salir");
                if (ingreso != null) {
                    opcion_usuario = Integer.parseInt(ingreso);
                } else {
                    opcion_usuario = 4;
                }
            }
            int opcion_pc = random.nextInt(1, 4);
            System.out.println(opcion_pc);
            switch (opcion_usuario) {
                case 1:
                    switch (opcion_pc) {
                        case 1:
                            resultado = "Empate";
                            break;
                        case 2:
                            resultado = "Ganador PC";
                            ganados_pc++;
                            break;
                        case 3:
                            resultado = "Ganador Usuario";
                            ++ganados_usuario;
                            break;
                    }
                    break;
                case 2:
                    switch (opcion_pc) {
                        case 1:
                            resultado = "Ganador Usuario";
                            ganados_usuario++;
                            break;
                        case 2:
                            resultado = "Empate";
                            break;
                        case 3:
                            resultado = "Ganador Pc";
                            ++ganados_pc;
                            break;
                    }
                    break;
                case 3:
                    switch (opcion_pc) {
                        case 1:
                            resultado = "Ganador PC";
                            ++ganados_pc;
                            break;
                        case 2:
                            resultado = "Ganador Usuario";
                            ++ganados_usuario;
                            break;
                        case 3:
                            resultado = "Empate";
                            break;
                    }
                    break;
            }
            if (opcion_usuario != 4) {
                JOptionPane.showMessageDialog(null, "Usuario: " + imprimirResultado(opcion_usuario) + "\n " +
                        "PC: " + imprimirResultado(opcion_pc) + "\n" + resultado +
                        "\n Resultado total: \n Usuario: " + ganados_usuario + "\t PC: " + ganados_pc);
            }
        }
        if (ganados_usuario > ganados_pc) {
            JOptionPane.showMessageDialog(null, "Ganaste!");
        } else if (ganados_pc > ganados_usuario) {
            JOptionPane.showMessageDialog(null, "Perdiste!");
        } else {
            JOptionPane.showMessageDialog(null, "Empate!");
        }
    }

    public static String imprimirResultado(int numero) {
        switch (numero) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "";
        }
    }
}
