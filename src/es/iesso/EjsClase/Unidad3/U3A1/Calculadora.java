package es.iesso.EjsClase.Unidad3.U3A1;

public class Calculadora {

    private double n1;
    private double n2;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double suma() {
        return this.n1 + this.n2;
    }

    public double resta() {
        return this.n1 - this.n2;
    }

    public double multiplicacion() {
        return this.n1 * this.n2;
    }

    public double division() {
        if(this.n2 == 0)
            return 0;
        else
            return this.n1 / this.n2;
    }
}