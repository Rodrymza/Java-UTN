package ReservasVuelos;

abstract class Vuelo implements Promocionable{
    private int numeroVuelo;
    private String origen;
    private String destino;
    private String fecha;

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public Vuelo(int numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }
    public abstract int calcularPrecio();
    public void mostrar_vuelo() {
        System.out.println("Vuelo N° " + getNumeroVuelo() + " Fecha " +getFecha() + " -" +  getOrigen() + " - " + getDestino());
    }


}
