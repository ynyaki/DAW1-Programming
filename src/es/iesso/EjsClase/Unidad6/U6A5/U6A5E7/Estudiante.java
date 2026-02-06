package es.iesso.EjsClase.Unidad6.U6A5.U6A5E7;

import java.util.Arrays;

public class Estudiante implements Comparable<Estudiante> {

    private String nombre;
    private int altura;
    private int edad;

    public Estudiante(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " cm - Edad: " + edad + " años";
    }

    @Override
    public int compareTo(Estudiante e) {
        return compareByNombreEdadAltura(this, e);
    }

    private static int compareByNombreEdadAltura(Estudiante e1, Estudiante e2) {
        int orden = compareNombre(e1, e2);
        if(orden == 0) {
            orden = compareEdad(e1, e2);
            if(orden == 0)
                orden = compareAltura(e1, e2);
        }
        return orden;
    }

    private static int compareByAlturaEdad(Estudiante e1, Estudiante e2) {
        int orden = compareAltura(e1, e2);
        if(orden == 0)
            orden = compareEdad(e1, e2);
        return orden;
    }

    private static int compareNombre(Estudiante e1, Estudiante e2) {
        String[] nombres = new String[] {e1.nombre, e2.nombre};
        if(e1.nombre.equals(e2.nombre))
            return 0;
        Arrays.sort(nombres);
        if(e1.nombre.equals(nombres[0]))
            return -1;
        else
            return 1;
    }

    private static int compareAltura(Estudiante e1, Estudiante e2) {
        return Integer.compare(e1.altura, e2.altura);
    }

    private static int compareEdad(Estudiante e1, Estudiante e2) {
        return Integer.compare(e1.edad, e2.edad);
    }
}
