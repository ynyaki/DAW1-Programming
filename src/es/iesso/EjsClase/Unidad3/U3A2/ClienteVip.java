package es.iesso.EjsClase.Unidad3.U3A2;

public class ClienteVip {

    public enum TipoVip {
        GOLD,
        SILVER,
        NORMAL,
    }

    private String nombre;
    private double limiteCredito;
    private String email;
    private String tipoVip;

    public ClienteVip(String nombre, double limiteCredito, String email, String tipoVip) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.email = email;
        this.tipoVip = tipoVip;
    }

    public ClienteVip(String nombre, String tipoVip) {
        this(nombre, 0, null, tipoVip);
    }

    public ClienteVip() {
        this(null, 0, null, null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(String tipoVip) {
        this.tipoVip = tipoVip;
    }
}
