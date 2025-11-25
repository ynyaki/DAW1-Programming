package es.iesso.Otros.PracticaExamen1.Correo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        while(true) {
            System.out.print("Introduzca su correo: ");
            input = sc.next().trim();
            sc.nextLine();
            if(esCorreoValido(input))
                System.out.println("\"" + input + "\" - SÍ");
            else
                System.out.println("\"" + input + "\" - NO");
        }
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
        boolean esValido = true;

        // Verificar que s[0] es alfabético
        if(!Character.isLetter(s.charAt(0)))
            esValido =  false;
        else
            // Verificar si s[i>0] es alfanumérico
            if(s.length() > 1)
                for(int i = 1; i < s.length(); i++)
                    if(!Character.isLetterOrDigit(s.charAt(i)))
                        esValido =  false;

        return esValido;
    }

    private static boolean esServidorValido(String s) {
        boolean esValido = true;

        for(int i = 0; i < s.length(); i++)
            // Verificar si cada caracter es alfanumérico
            if(!Character.isLetterOrDigit(s.charAt(i)))
                esValido = false;

        return esValido;
    }

    private static boolean esDominioValido(String s) {
        boolean esValido = true;

        // Verificar que la longitud sea al menos 2
        if(s.length() < 2)
            esValido = false;
        else
            for(int i = 0; i < s.length(); i++)
                // Verificar si cada caracter es alfabético
                if(!Character.isLetter(s.charAt(i)))
                    esValido = false;

        return esValido;
    }
}