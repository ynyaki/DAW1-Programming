package es.iesso.EjsClase.Unidad3.U3A3;

public abstract class Figura {

    public static double area(double radio) {
        if(radio < 0)
            return -1;
        else
            return Math.PI * radio * radio;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0)
            return -1;
        else
            return x * y;
    }

    public static double area(double bMay, double bMen, double h) {
        if(bMay < 0 || bMen < 0 || h < 0)
            return -1;
        else
            return (bMay + bMen / 2) * h;
    }
}
