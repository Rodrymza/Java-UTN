package Ejercicio03;

public class DetalleFactura {
    private int codigo_articulo;
    private String nombre_articulo;
    private int cantidad;
    private double precio_unitario;
    private double descuento_item;
    private double subtotal;

    public DetalleFactura(int codigo_articulo, String nombre_articulo, int cantidad, double precio_unitario) {
        this.codigo_articulo = codigo_articulo;
        this.nombre_articulo = nombre_articulo;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        if (this.cantidad > 5) {
            this.descuento_item = 0.1;
        } else {
            this.descuento_item = 0;
        }
        this.subtotal = precio_unitario * cantidad *(1 - descuento_item);

    }

    public DetalleFactura() {
    }

    public int getCodigo_artitulo() {
        return codigo_articulo;
    }

    public void setCodigo_artitulo(String codigo_artitulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getDescuento_item() {
        return descuento_item;
    }

    public void setDescuento_item(double descuento_item) {
        this.descuento_item = descuento_item;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public void mostrar_detalles() {
        System.out.println("Articulo agregado: " + this.nombre_articulo);
        System.out.println("Cantidad agregada: " + this.cantidad);
        System.out.println("Precio unitario: $" + this.precio_unitario + " Total $" + this.subtotal);
    }
}
