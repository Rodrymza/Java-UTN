package ReservasVuelos;

public class VueloRegular extends Vuelo implements Promocionable{
    private int numeroAsientos;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }
    @Override
    public int calcularPrecio() {
        int precioBase = 200;
        return (int) precioBase * numeroAsientos;
    }

    @Override
    public int aplicarPromocion() {
        double descuento = 0.15;
        return (int) (calcularPrecio() * descuento);
    }
}
