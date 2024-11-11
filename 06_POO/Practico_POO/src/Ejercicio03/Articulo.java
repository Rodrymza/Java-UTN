package Ejercicio03;

public class Articulo {
    private String nombre;
    private int codigo;
    private int stock;

    public Articulo( int codigo, String nombre, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }

    public Articulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void cambiar_stock(int cantidad) {
        this.stock = stock - cantidad;
    }
}
