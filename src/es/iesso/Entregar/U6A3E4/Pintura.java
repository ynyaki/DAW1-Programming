package es.iesso.Entregar.U6A3E4;

import es.iesso.Impresora;

public class Pintura {

    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getPinturaNecesaria(Forma f) {
        return (f.getArea() / cobertura);
    }

    public String toString(Forma f) {
        return ("Cantidad de pintura (cobertura de "
                + Impresora.format(cobertura, 3)
                + ") necesaria para cubrir un/a "
                + f.getNombre().toLowerCase() + " de "
                + Impresora.format(f.getArea(), 3)
                + " metros cuadrados de área: "
                + Impresora.format(getPinturaNecesaria(f), 3));
    }
}
