package es.iesso.EjsClase.Unidad4.U4A4;

public class MesCollector {

    private final int mes;
    private final int anyo;
    private final int diasMes;
    private int[] temperatura;

    public MesCollector(int mes, int anyo) {
        this.mes = mes;
        this.anyo = anyo;
        this.diasMes = calcDiasMes(mes, anyo);
        this.temperatura = new int[this.diasMes];
    }

    public int getTemperatura(int dia) {
        if(dia <= 0 || dia > this.diasMes)
            return -1;
        else
            return this.temperatura[dia - 1];
    }

    public void setTemperatura(int dia, int temperatura) {
        if(0 < dia && dia <= this.diasMes)
            this.temperatura[dia - 1] = temperatura;
    }

    @Override
    public String toString() {
        String sCampos;
        String sTemp;

        sCampos = ("Mes " + this.mes + "/" + this.anyo);
        sTemp = "Temperaturas: [";
        for(int i = 0; i < this.diasMes; i++) {
            sTemp = sTemp.concat(Integer.toString(this.temperatura[i] - 1));
            if(i < this.diasMes - 1)
                sTemp = sTemp.concat(", ");
        }
        sTemp = sTemp.concat("]");
        return sCampos + "\n" + sTemp;
    }

    private static int calcDiasMes(int mes, int anyo) {
        int diasMes = 0;
        if(mes == 1)
            diasMes = 31;
        else if(mes == 2 && anyo % 4 != 0)
            diasMes = 28;
        else if(mes == 2)
            diasMes = 29;
        else if(mes == 3)
            diasMes = 31;
        else if(mes == 4)
            diasMes = 30;
        else if(mes == 5)
            diasMes = 31;
        else if(mes == 6)
            diasMes = 30;
        else if(mes == 7)
            diasMes = 31;
        else if(mes == 8)
            diasMes = 31;
        else if(mes == 9)
            diasMes = 30;
        else if(mes == 10)
            diasMes = 31;
        else if(mes == 11)
            diasMes = 30;
        else if(mes == 12)
            diasMes = 31;
        return diasMes;
    }
}
