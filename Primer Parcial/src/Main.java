import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList lista_numeros = new ArrayList();
        lista_numeros.add(23);
        lista_numeros.add(24);
        lista_numeros.add(40);
        for (int i = 0; i < lista_numeros.size(); i++) {
            System.out.println(lista_numeros.get(i));
        }

    }
}