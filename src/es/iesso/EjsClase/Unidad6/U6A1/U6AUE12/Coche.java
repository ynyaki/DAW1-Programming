package es.iesso.EjsClase.Unidad6.U6A1.U6AUE12;

public class Coche extends Vehiculo {

    protected int nPuertas;
    protected int anyosGarantia;

    protected Coche(String marca, String modelo, int nPuertas,
                    int anyosGarantia) {
        super(Tipo.COCHE, marca, modelo, 4);
        this.nPuertas = nPuertas;
        this.anyosGarantia = anyosGarantia;
    }
}