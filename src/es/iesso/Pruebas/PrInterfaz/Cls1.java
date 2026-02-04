package es.iesso.Pruebas.PrInterfaz;

public class Cls1 implements Int1, Int2 {
    
    int n1;
    String s1;

    public Cls1(int n1, String s1) {
        this.n1 = n1;
        this.s1 = s1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    @Override
    public int calcular(int n2) {
        return 0;
    }

    @Override
    public void imprHola() {
        System.out.println("hola, " + s1);
    }
}
