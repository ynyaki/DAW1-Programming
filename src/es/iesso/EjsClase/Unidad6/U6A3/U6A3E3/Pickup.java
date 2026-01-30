package es.iesso.EjsClase.Unidad6.U6A3.U6A3E3;

public class Pickup extends Coche {

    public Pickup(String modelo, int nCilindros) {
        super(modelo, nCilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando la flamante pickup...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando la pickup con mucho tacto...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando la pickup, con cuidado" +
                " de no tirar nada.");
    }
}
