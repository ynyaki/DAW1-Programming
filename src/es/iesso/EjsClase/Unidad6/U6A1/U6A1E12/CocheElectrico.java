package es.iesso.EjsClase.Unidad6.U6A1.U6A1E12;

public class CocheElectrico extends Coche {

    private double capBateria;

    public CocheElectrico(String marca, String modelo, double capBateria,
                           int nPuertas, int anyosGarantia) {
        super(marca, modelo, nPuertas, anyosGarantia);
        this.capBateria = capBateria;
    }

    public double getCapBateria() {
        return this.capBateria;
    }

    public void setBateria(double newCapBateria) {
        this.capBateria = newCapBateria;
    }
}