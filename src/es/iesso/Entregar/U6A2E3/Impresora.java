package es.iesso.Entregar.U6A2E3;

public class Impresora {

    private static final double MAX_TONER = 100;

    private final String modelo;
    private final String marca;
    private final boolean esDeDobleCara;

    private int nPagsImpr;
    private double nivelToner;

    public Impresora(String modelo, String marca,
                     boolean esDeDobleCara, int nPagsImpr, double nivelToner) {
        this.modelo = setString(modelo);
        this.marca = setString(marca);
        this.esDeDobleCara = esDeDobleCara;
        this.nPagsImpr = setNumPagsImpr(nPagsImpr);
        setNivelToner(nivelToner);
    }

    public Impresora(String modelo, String marca,
                     boolean esDeDobleCara, int nPagsImpr) {
        this(modelo, marca, esDeDobleCara, nPagsImpr, 0);
    }

    public Impresora(String modelo, String marca,
                     boolean esDeDobleCara, double nivelToner) {
        this(modelo, marca, esDeDobleCara, 0, nivelToner);
    }

    public Impresora(String modelo, String marca, boolean esDeDobleCara) {
        this(modelo, marca, esDeDobleCara, 0, 0);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        if(modelo.isBlank() && marca.isBlank())
            return null;
        else if(marca.isBlank())
            return modelo;
        else if(modelo.isBlank())
            return marca;
        else
            return (modelo + " - " + marca);
    }

    public boolean esDeDobleCara() {
        return esDeDobleCara;
    }

    public int getNumPagsImpr() {
        return nPagsImpr;
    }

    public double getNivelToner() {
        return nivelToner;
    }

    public void setNivelToner(double nivelToner) {
        if(nivelToner < 0)
            this.nivelToner = 0;
        else
            this.nivelToner = Math.min(nivelToner, MAX_TONER);
    }

    public void setNivelTonerMax() {
        this.nivelToner = MAX_TONER;
    }

    public void imprPagina() {
        if(this.esDeDobleCara)
            this.nPagsImpr += 2;
        else
            this.nPagsImpr++;
    }

    public void imprPaginas(int nPags) {
        for(int i = 1; i <= nPags; i++)
            imprPagina();
    }

    @Override
    public String toString() {
        String nombre = ("Impresora"
                + ((getNombre() == null) ? "" : " " + getNombre()));
        String esDeDobleCara = ("Formato: "
                + (esDeDobleCara() ? "Doble cara" : "Una cara"));
        String nPagsImpr = "Nº. de págs. impresas: " + this.nPagsImpr;
        String nivelToner = "Nivel de tóner: "
                + format(this.nivelToner) + "%";

        return (nombre + "\n"
                + esDeDobleCara + "\n"
                + nPagsImpr + "\n"
                + nivelToner + "\n");
    }

    private String setString(String s) {
        if(s == null || s.trim().isBlank())
            return "";
        else
            return s;
    }

    private int setNumPagsImpr(int nPagsImpr) {
        return Math.max(0, nPagsImpr);
    }

    /** Función copiada para imprimir un número con núm mínimo de decimales. */
    public static String format(double num) {
        if(num == (long) num)
            return String.format("%d", (long) num);
        else
            return String.format("%s", num);
    }
}