package es.iesso.EjsClase.Unidad6.U6A5.U6A5E456;

public abstract class Forma {

    private int nLados;

    public Forma(int nLados) {
        this.nLados = nLados;
    }

    public int getNumLados() {
        return nLados;
    }

    protected abstract double getPerimetro();

    protected abstract double getArea();
}
