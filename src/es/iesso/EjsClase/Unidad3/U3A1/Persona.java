package es.iesso.EjsClase.Unidad3.U3A1;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String persona) {
        persona = persona.trim();
        this.nombre = persona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido.trim();
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0)
            this.edad = edad;
        else
            this.edad = -1;
    }

    public boolean esAdolescente() {
        return (this.edad > 12 && this.edad < 20);
    }

    public String getNombreCompleto() {
        if (!this.nombre.isEmpty() && !this.apellido.isEmpty())
            return this.nombre + " " + this.apellido;
        else
            return this.nombre + this.apellido;
    }
}
