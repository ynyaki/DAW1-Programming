package es.iesso.EjsClase.Unidad6.U6A5.U6A5E2;

public abstract class Employee {

    private String nombre;
    private String cargo;

    public Employee(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    protected abstract double calculateWeeklyPay();
}
