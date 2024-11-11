package Ejercicio03;

import java.util.ArrayList;

public class Factura {
    String fecha_factura;
    long numero_factura;
    String cliente;
    ArrayList<DetalleFactura> detalles_factura = new ArrayList<>();

    public Factura() {
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public long getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(long numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void agregar_articulo(DetalleFactura articulo) {
        if (articulo.getCodigo_artitulo() !=0) {
            articulo.mostrar_detalles();
            this.detalles_factura.add(articulo);
        } else {
            System.out.println("No se agrego el articulo");
        }

        ;
    }
    public void calcular_total() {
        double total = 0;
        for (DetalleFactura detalles : detalles_factura) {
            total += detalles.getSubtotal();
        }
        System.out.println("El total de la factura es de $" + total);
    }
    public void mostrar_detalles() {
        for (DetalleFactura articulo : detalles_factura) {
            System.out.println(articulo.getNombre_articulo() + " " + articulo.getCantidad() + " " + articulo.getSubtotal());
        }
    }
}


