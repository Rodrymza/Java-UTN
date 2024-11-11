package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    private ArrayList<Plato> lista_platos = new ArrayList<>();
    public MenuRestaurant() {
    }
    public void menuPrincipal() {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Menu principal\nSeleccione opcion deseada\n1 Agregar plato\n2 Mostrar Platos\n3 Salir");
            String respuesta = input.nextLine();
            switch (respuesta) {
                case "1": agregarPlato();
                    break;
                case "2": mostrarMenu();
                break;
                case "3": break;
                default:
                    System.out.println("Opcion incorrecta");
                    continue;
            }
        if (respuesta.equals("3")) {
            break;
        }
        }
    }
    public void agregarPlato() {
        while (true){
            Plato plato_actual = new Plato();
            plato_actual.pedirDatos();
            lista_platos.add(plato_actual);
            if (! plato_actual.isEsBebida()) {
                plato_actual.anadirIngrediente();
            }
            if (! plato_actual.pedirBoolean("Desea añadir mas platos?")) {
                break;
            }
        }
    }
    public void mostrarMenu() {
        for (Plato plato_actual : lista_platos) {
            plato_actual.mostrarPlato();
        }
    }

    public static void main(String[] args) {
        MenuRestaurant app = new MenuRestaurant();
        app.menuPrincipal();
    }
}
