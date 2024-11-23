package SistemPagos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pagos gestion_pagos = new Pagos();
        Scanner input = new Scanner(System.in);
        while (true) {
            mostrar_menu();
            String seleccion = input.nextLine();
            switch (seleccion) {

                case "5":
                    System.out.println("Saliendo del la aplicacion...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    continue;
            }
            if (seleccion.equals("5")) {
                break;
            }
        }
    }
    public static void mostrar_menu() {
        System.out.println("1. Realizar un pago \n2. Agregar Metodo de pago \n3. Mostrar metodos de pago \n4. Cancelar pago" +
                "\n5. Salir");
    }
}
