package es.iesso.EjsClase.Unidad6.U6A3.U6A3E3;

public class Todoterreno extends Coche {

    public Todoterreno(String modelo, int nCilindros) {
        super(modelo, nCilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el to'terreno...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando... por cualquier terreno.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el todoterreno..." +
                " para no caer del precipicio.");
    }
}
