package Ejercicio03;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Factura factura = crear_factura();
       factura.mostrar_detalles();
        factura.calcular_total();



    }
    public static Articulo seleccionar_articulo(Articulo[] lista_articulos) {
        int i= 1;
        Scanner input = new Scanner(System.in);
        for (Articulo elemento: lista_articulos ) {
                System.out.println(i + " " + elemento.getNombre() + " " + elemento.getStock());
                i++;
            }
        int seleccion = 0;
        while (true) {
            boolean salida = false;
            System.out.println("Seleccione un elemento de la lista");
            seleccion = Integer.parseInt(input.nextLine()) - 1;
            if (seleccion >= 0 && seleccion < lista_articulos.length) {
                break;
            } else {
                System.out.println("Codigo incorrecto");
                continue;
            }
        }
        System.out.println("Articulo seleccionado: " + lista_articulos[seleccion].getNombre());
        System.out.println("Ingrese la cantidad:");
        int cantidad = Integer.parseInt(input.nextLine());
        if (lista_articulos[seleccion].getStock() >= cantidad) {
            lista_articulos[seleccion].cambiar_stock(cantidad);
            System.out.println("Retiraste " + cantidad + " unidades de " + lista_articulos[seleccion].getNombre());
            Articulo articulo = new Articulo(lista_articulos[seleccion].getCodigo(), lista_articulos[seleccion].getNombre(), cantidad);
            return articulo;
        } else {
            System.out.println("Stock insuficiente");
            Articulo articulo_retorno =  new Articulo(0, "articulo nulo", 0);
            return articulo_retorno;
        }
    }

    public static Factura crear_factura(){
        Scanner input = new Scanner(System.in);
        Factura nueva_factura = new Factura();
        System.out.println("Ingrese fecha de la factura");
        String fecha = input.nextLine();
        nueva_factura.setFecha_factura(fecha);
        System.out.println("Ingrese numero de factura");
        long numero = Long.parseLong(input.nextLine());
        nueva_factura.setNumero_factura(numero);
        System.out.println("Ingrese cliente");
        String cliente = input.nextLine();
        nueva_factura.setCliente(cliente);

        while (true) {
            DetalleFactura nuevo_detalle = agregar_articulo();
            nueva_factura.agregar_articulo(nuevo_detalle);
            System.out.println("Agregar mas articulos?");
            String repuesta = input.nextLine();
            if (repuesta.equals("n")) {
                break;
            }
        }
        return nueva_factura;
    }

    public static DetalleFactura agregar_articulo() {
        Articulo[] lista_articulos = { new Articulo(101, "Leche", 25),
                new Articulo(102, "Gaseosa", 30),
                new Articulo(103, "Fideos", 15),
                new Articulo(104, "Arroz", 28),
                new Articulo(105, "Vino", 120),
                new Articulo(106, "Manteca", 20),
                new Articulo(107, "Lavandina", 18),
                new Articulo(108, "Detergente", 46),
                new Articulo(109, "Jabón en Polvo", 96),
                new Articulo(110, "Galletas", 60) };

        DetalleFactura nuevo_articulo = new DetalleFactura();
        Scanner input = new Scanner(System.in);
        Articulo articulo = seleccionar_articulo(lista_articulos);
        if (articulo.getCodigo() != 0) {
            System.out.println("Ingrese precio de " + articulo.getNombre());
            double precio = Double.parseDouble(input.nextLine());
            DetalleFactura nuevo_detalle = new DetalleFactura(articulo.getCodigo(), articulo.getNombre(), articulo.getStock(), precio);
            return nuevo_detalle;
        } else {
            return new DetalleFactura();
        }

    }
}

