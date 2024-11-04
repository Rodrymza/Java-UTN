package Ejercicio01;

public class Nota {
    private String catedra;
    private int notaExamen;

    public String getCatedra() {
        return catedra;
    }

    public int getNotaExamen() {
        return notaExamen;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public void setNotaExamen(int notaExamen) {
        this.notaExamen = notaExamen;
    }

    public Nota(String catedra, int notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }
}
