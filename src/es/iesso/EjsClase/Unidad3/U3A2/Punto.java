package es.iesso.EjsClase.Unidad3.U3A2;

public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double distancia(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) * Math.pow((y2 - y1), 2));
    }

    public static double distancia(Punto p) {
        return distancia(p.x, p.y, 0, 0);
    }

    public double distancia(Punto p, int x2, int y2) {
        return distancia(p.x, p.y, x2, y2);
    }

    public double distancia() {
        return distancia(this.x, this.y, 0, 0);
    }
}