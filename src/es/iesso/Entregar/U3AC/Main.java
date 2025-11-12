package es.iesso.Entregar.U3AC;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // TODO
            // Verificar que tok0 = alfa
            // Si tok0.size > 1
                // Verificar que tok0[1->] = alfanum
            // Verif. que tok1 = alfanum
            // Verif. que tok2 = alfa
        System.out.println(esCorreoValido("inaki@mail.com".trim()));
    }

    public static boolean esCorreoValido(String mail) {

        // Verificar que contiene "@" y "."
        if(noContieneUn(mail, '@') || noContieneUn(mail, '.'))
            return false;

        // Dividir en tokens con "@" y "."
        StringTokenizer sTok = new StringTokenizer(mail, "@.");

        // Verificar que son 3 tokens
        if(sTok.countTokens() != 3)
            return false;

        // Asignación de StringTokenizer a String[]
        String[] tok = new String[3];
        for(int i = 0; sTok.hasMoreTokens(); i++)
            tok[i] = sTok.nextToken();

        return esNombreValido(tok[0]) && esServidorValido(tok[1]) && esDominioValido(tok[2]);
    }

    private static boolean noContieneUn(String s, char ch) {
        int n = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == ch)
                n++;
        return n != 1;
    }

    private static boolean esNombreValido(String s) {
        return false;
    }

    private static boolean esServidorValido(String s) {
        return false;
    }

    private static boolean esDominioValido(String s) {
        return false;
    }
}