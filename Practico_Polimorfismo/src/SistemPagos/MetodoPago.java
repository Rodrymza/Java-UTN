package SistemPagos;

abstract class MetodoPago {
    String titular;
    int numero;

    public MetodoPago(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    abstract public void realizarPago();
}
