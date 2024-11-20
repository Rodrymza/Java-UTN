package ReservasVuelos;

public class VueloCharter extends Vuelo implements Promocionable{
    int preciototal;
    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int preciototal) {
        super(numeroVuelo, origen, destino, fecha);
        this.preciototal = preciototal;
    }

    @Override
    public int calcularPrecio() {
        return preciototal;
    }

    @Override
    public int aplicarPromocion() {
        double descuento = 0.2;
        return (int) (preciototal * descuento);
    }
}
