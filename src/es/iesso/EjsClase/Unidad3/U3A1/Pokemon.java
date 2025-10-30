package es.iesso.EjsClase.Unidad3.U3A1;

public class Pokemon {

    public enum TIPO {
        NORMAL,
        FUEGO,
        AGUA,
        PLANTA,
        ELECTRICO,
        HIELO,
        LUCHA,
        VENENO,
        TIERRA,
        VOLADOR,
        PSIQUICO,
        BICHO,
        ROCA,
        FANTASMA,
        DRAGON,
        SINIESTRO,
        ACERO,
        HADA
    }

    /*
        ⚪
        🔥
        💧
        🌳
        ✨
        ❄️
        👊
        🍄
        ⛰️
        🌌
        🪽
        🌀
        🐛
        🪨
        💀
        🐉
        🦇
        🔧
        🌸
     */

    private final String nombreEsp;
    private final TIPO tipo1;
    private final TIPO tipo2;
    private final int nPokedex;
    private final float tamano;
    private final String color;
    private final String forma;
    private final String preevolucion;
    private final String evolucion;

    private String mote;
    private int nivel;
    private int pExp;
    private int pAmistad;

    private String naturaleza;
    private String habilidad;
    private String atq1;
    private String atq2;
    private String atq3;
    private String atq4;

    private int statPS;
    private int statAtq;
    private int statDef;
    private int statAtqEsp;
    private int statDefEsp;
    private int statVel;

    private final int iniPS;
    private final int iniAtq;
    private final int iniDef;
    private final int iniAtqEsp;
    private final int iniDefEsp;
    private final int iniVel;

    private final int incPS;
    private final int incAtq;
    private final int incDef;
    private final int incAtqEsp;
    private final int incDefEsp;
    private final int incVel;

    private final boolean tieneMega;

    private final TIPO megaTipo1;
    private final TIPO megaTipo2;
    private final String megaHab;
    private final int incMegaPS;
    private final int incMegaAtq;
    private final int incMegaDef;
    private final int incMegaAtqEsp;
    private final int incMegaDefEsp;
    private final int incMegaVel;

    public Pokemon(String nombreEsp, TIPO tipo1, TIPO tipo2, int nPokedex, float tamano, String color, String forma, String preevolucion, String evolucion, String mote, int nivel, int pExp, int pAmistad, String naturaleza, String habilidad, String atq1, String atq2, String atq3, String atq4, int iniPS, int iniAtq, int iniDef, int iniAtqEsp, int iniDefEsp, int iniVel, int incPS, int incAtq, int incDef, int incAtqEsp, int incDefEsp, int incVel, boolean tieneMega, TIPO megaTipo1, TIPO megaTipo2, String megaHab, int incMegaPS, int incMegaAtq, int incMegaDef, int incMegaAtqEsp, int incMegaDefEsp, int incMegaVel) {
        this.nombreEsp = nombreEsp;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2; // TODO manejar in nulo
        this.nPokedex = nPokedex;
        this.tamano = tamano;
        this.color = color;
        this.forma = forma;
        this.preevolucion = preevolucion; // TODO manejar in nulo
        this.evolucion = evolucion; // TODO manejar in nulo
        this.mote = mote; // TODO manejar in nulo
        this.nivel = nivel; // TODO Manejar subir estadísticas con nivel
        this.pExp = pExp;
        this.pAmistad = pAmistad;
        this.naturaleza = naturaleza;
        this.habilidad = habilidad;
        this.atq1 = atq1;
        this.atq2 = atq2;
        this.atq3 = atq3;
        this.atq4 = atq4;
        this.iniPS = iniPS;
        this.iniAtq = iniAtq;
        this.iniDef = iniDef;
        this.iniAtqEsp = iniAtqEsp;
        this.iniDefEsp = iniDefEsp;
        this.iniVel = iniVel;
        this.incPS = incPS;
        this.incAtq = incAtq;
        this.incDef = incDef;
        this.incAtqEsp = incAtqEsp;
        this.incDefEsp = incDefEsp;
        this.incVel = incVel;
        this.tieneMega = tieneMega;
        this.megaTipo1 = megaTipo1;
        this.megaTipo2 = megaTipo2;
        this.megaHab = megaHab;
        this.incMegaPS = incMegaPS;
        this.incMegaAtq = incMegaAtq;
        this.incMegaDef = incMegaDef;
        this.incMegaAtqEsp = incMegaAtqEsp;
        this.incMegaDefEsp = incMegaDefEsp;
        this.incMegaVel = incMegaVel;

        this.statPS = iniPS + nivel * incPS;
        this.statAtq = iniAtq + nivel * incAtq;
        this.statDef = iniDef + nivel * incDef;
        this.statAtqEsp = iniAtqEsp + nivel * incAtqEsp;
        this.statDefEsp = iniDefEsp + nivel * incDefEsp;
        this.statVel = iniVel + nivel * incVel;
    }

    public Pokemon(String nombreEsp, TIPO tipo1, TIPO tipo2, int nPokedex,
                   float tamano, String color, String forma,
                   String preevolucion, String evolucion, String mote,
                   int nivel, int pExp, int pAmistad, String naturaleza,
                   String habilidad, String atq1, String atq2, String atq3,
                   String atq4, int iniPS, int iniAtq, int iniDef,
                   int iniAtqEsp, int iniDefEsp, int iniVel, int incPS,
                   int incAtq, int incDef, int incAtqEsp, int incDefEsp,
                   int incVel) {
        this(nombreEsp, tipo1, tipo2, nPokedex, tamano, color, forma,
                preevolucion, evolucion, mote, nivel, pExp, pAmistad,
                naturaleza, habilidad, atq1, atq2, atq3, atq4, iniPS,
                iniAtq, iniDef, iniAtqEsp, iniDefEsp, iniVel, incPS,
                incAtq, incAtqEsp, incDef, incDefEsp, incVel,
                false, null, null, null, 0, 0, 0, 0, 0, 0);
    }

    public String getNombreEsp() {
        return nombreEsp;
    }

    public TIPO getTipo1() {
        return tipo1;
    }

    public TIPO getTipo2() {
        return tipo2;
    }

    public int getnPokedex() {
        return nPokedex;
    }

    public float getTamano() {
        return tamano;
    }

    public String getColor() {
        return color;
    }

    public String getForma() {
        return forma;
    }

    public String getPreevolucion() {
        return preevolucion;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public String getMote() {
        return mote;
    }

    public int getNivel() {
        return nivel;
    }

    public int getpExp() {
        return pExp;
    }

    public int getpAmistad() {
        return pAmistad;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getAtq1() {
        return atq1;
    }

    public String getAtq2() {
        return atq2;
    }

    public String getAtq3() {
        return atq3;
    }

    public String getAtq4() {
        return atq4;
    }

    public int getStatPS() {
        return statPS;
    }

    public int getStatAtq() {
        return statAtq;
    }

    public int getStatDef() {
        return statDef;
    }

    public int getStatAtqEsp() {
        return statAtqEsp;
    }

    public int getStatDefEsp() {
        return statDefEsp;
    }

    public int getStatVel() {
        return statVel;
    }

    public int getIniPS() {
        return iniPS;
    }

    public int getIniAtq() {
        return iniAtq;
    }

    public int getIniDef() {
        return iniDef;
    }

    public int getIniAtqEsp() {
        return iniAtqEsp;
    }

    public int getIniDefEsp() {
        return iniDefEsp;
    }

    public int getIniVel() {
        return iniVel;
    }

    public int getIncPS() {
        return incPS;
    }

    public int getIncAtq() {
        return incAtq;
    }

    public int getIncDef() {
        return incDef;
    }

    public int getIncAtqEsp() {
        return incAtqEsp;
    }

    public int getIncDefEsp() {
        return incDefEsp;
    }

    public int getIncVel() {
        return incVel;
    }

    public boolean TieneMegaevolucion() {
        return tieneMega;
    }

    public TIPO getMegaTipo1() {
        return megaTipo1;
    }

    public TIPO getMegaTipo2() {
        return megaTipo2;
    }

    public String getMegaHab() {
        return megaHab;
    }

    public int getIncMegaPS() {
        return incMegaPS;
    }

    public int getIncMegaAtq() {
        return incMegaAtq;
    }

    public int getIncMegaDef() {
        return incMegaDef;
    }

    public int getIncMegaAtqEsp() {
        return incMegaAtqEsp;
    }

    public int getIncMegaDefEsp() {
        return incMegaDefEsp;
    }

    public int getIncMegaVel() {
        return incMegaVel;
    }

    public void subirNivel() {
        subirNiveles(1);
    }

    public void subirNiveles(int n) {
        this.statPS += this.statPS * n;
        this.statAtq += this.statAtq * n;
        this.statDef += this.statDef * n;
        this.statAtqEsp += this.statAtqEsp * n;
        this.statDefEsp += this.statDefEsp * n;
        this.statVel += this.statVel * n;
    }

    public void setMote(String mote) {
        if(mote == null || mote.isBlank())
            this.mote = this.nombreEsp;
        else
            this.mote = mote;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setAtq1(String atq1) {
        this.atq1 = atq1;
    }

    public void setAtq2(String atq2) {
        this.atq2 = atq2;
    }

    public void setAtq3(String atq3) {
        this.atq3 = atq3;
    }

    public void setAtq4(String atq4) {
        this.atq4 = atq4;
    }

    // TODO Imprimir Pokémon
    // TODO Imprimir Megaevolución
}