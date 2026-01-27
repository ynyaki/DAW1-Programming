package es.iesso.EjsClase.Unidad6.U6A1.U6AUE12;

public class CocheCombustion extends Coche {

    private int nMarcha;

    public CocheCombustion(String marca, String modelo, int nPuertas,
                           int anyosGarantia) {
        super(marca, modelo, nPuertas, anyosGarantia);
    }

    public int getMarcha() {
        return nMarcha;
    }

    public void setMarcha(int nMarcha) {
        this.nMarcha = nMarcha;
    }
}
