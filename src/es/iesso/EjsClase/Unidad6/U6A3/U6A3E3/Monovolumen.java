package es.iesso.EjsClase.Unidad6.U6A3.U6A3E3;

public class Monovolumen extends Coche {

    public Monovolumen(String modelo, int nCilindros) {
        super(modelo, nCilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el monovolumen...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando... Muuuy despacio...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el monovolumen," +
                " procurando que el niño no salga volando...");
    }
}
