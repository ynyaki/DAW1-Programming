package es.iesso.EjsClase.Unidad6.U6A2.U6A2E2;

public class Sujecion {

    private String material;
    private int nRuedas;
    private Rueda[] ruedas;

    public Sujecion(String material, int nRuedas) {
        this.material = material;
        this.nRuedas = nRuedas;
        this.ruedas = new Rueda[nRuedas];
    }

    public String getMaterial() {
        return material;
    }

    public int getNumRuedas() {
        return nRuedas;
    }

    public Rueda getRueda(int nRueda) {
        return this.ruedas[nRueda];
    }
}
