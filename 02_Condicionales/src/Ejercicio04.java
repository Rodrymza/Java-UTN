//Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
//calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
//peso, peso normal, sobrepeso, obesidad)

import javax.swing.*;
public class Ejercicio04 {
    public static void main(String[] args) {

        double altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en cm"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso en kg"));

        double imc = peso / Math.pow(altura/100, 2);
        System.out.println(imc);
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"IMC bajo: " + String.format("%.2f", imc) + "\nEste puede ser un indicativo" +
                    "de desnutricion o deficil calorico prolongado. \nEs recomendable que consultes con un especialista" +
                    "a fin de asegurar que el cuerpo reciba todos los nutrientes necesarios");
        }
        else if (imc >= 18.5 && imc <25) {
            JOptionPane.showMessageDialog(null,"Rango normal: "+ String.format("%.2f", imc) +
                    "\nGeneralmente es signo de buena salud y " +
                    "equilibrio entre alimentacion y actividad fisica. \nManten una dieta equilibrada y rutina de ejercicio regular para" +
                    "conservar el bienestar");
        } else if (imc >= 25 && imc <30) {
            JOptionPane.showMessageDialog(null, "Sobrepeso: " + String.format("%.2f", imc) +
                    "\nUn IMC alto puede aumentar el riesgo" +
                    "de desarrolar problemas de salud como enfermedades cardiacas o diabetes. \nConsidera ajustar tu estilo de vida" +
                    "con una combinacion de alimentacion balanceada y ejercicio regular");
        } else {
            JOptionPane.showMessageDialog(null, "Obesidad: " +String.format("%.2f", imc) +
                    "\nEsta puede conllevar riesgos serios para la " +
                    "salud, incluyendo presion arterial alta, enfermedades cardiacas y problemas articulares\n" +
                    "Es fundamental buscar la orientacion de un medico o nutricionista para un plan de perdida de peso saludable");
        }
    }
}
