package es.iesso.Entregar.U7A2;

import java.util.*;

public class Main {

        private static final Scanner sc = new Scanner(System.in);

        private static ArrayList<Album> biblioteca;
        private static LinkedList<Cancion> playlist;
        private static ListIterator<Cancion> repro;
        private static String cActual;
        private static int dirRepro = 0;

        static void main() {
                boolean seguir = true;
                inicializar();
                imprInicio();
                while(seguir)
                        seguir = ejecBucleMenu();
                imprSalir();
        }

        private static void inicializar() {
                inicAlbumes();
                inicPlaylist();
                repro = playlist.listIterator();
        }

        private static void imprInicio() {
                imprTitulo();
                imprAlbumes();
        }

        private static boolean ejecBucleMenu() {
                boolean seguir = true;
                String com;
                imprComandos();
                com = pedirInput();
                System.out.println();
                switch(com) {
                        case "0" -> seguir = false;
                        case "1" -> menuSiguiente();
                        case "2" -> menuAnterior();
                        case "3" -> menuRepetirCancion();
                        case "4" -> menuImprPlaylist();
                        case "5" -> menuBorrarCancion();
                        default -> System.out.println("Error: comando no detectado");
                }
                if(seguir) {
                        System.out.println();
                        pedirEnter();
                }
                return seguir;
        }

        private static void menuBorrarCancion() {
                int n;
                String tC;
                System.out.println("Nº. de canción a borrar de la playlist:");
                n = pedirInt();
                System.out.println();
                if(n > 0 && n <= playlist.size()) {
                        tC = borrarCancion(n - 1);
                        System.out.println("(\"" + tC + "\" eliminada de la playlist)");
                } else
                        System.out.println("(Canción no encontrada)");
        }

        private static void menuSiguiente() {
                playSiguiente();
        }

        private static void menuAnterior() {
                playAnterior();
        }

        private static void playSiguiente() {
                if(!repro.hasNext()) {
                        System.out.println("(No hay canción siguiente)");
                        return;
                }
                if(dirRepro != 1) {
                        repro.next();
                        dirRepro = 1;
                }
                cActual = repro.next().toString();
                imprPlay(cActual);
        }

        private static void playAnterior() {
                if(!repro.hasPrevious()) {
                        System.out.println("(No hay canción anterior)");
                        return;
                }
                if(dirRepro != -1) {
                        repro.previous();
                        dirRepro = -1;
                }
                cActual = repro.previous().toString();
                imprPlay(cActual);
        }

        private static void menuRepetirCancion() {
                imprPlay(cActual);
        }

        private static String borrarCancion(int n) {
                String tC;
                int i;
                tC = playlist.get(n).getTitulo();
                repro = null;
                playlist.remove(n);
                if(n > 0)
                        i = n - 1;
                else
                        i = 0;
                repro = playlist.listIterator(i);
                dirRepro = -1;
                cActual = playlist.get(i).toString();
                return tC;
        }

        private static void imprPlay(String c) {
                System.out.println("Reproduciendo " + c);
        }

        private static void menuImprPlaylist() {
                imprPlaylist();
        }

        private static void imprPlaylist() {
                ListIterator<Cancion> ipl = playlist.listIterator();
                System.out.println("Playlist:");
                if(playlist.isEmpty())
                        System.out.println("(vacía)");
                while(ipl.hasNext())
                        System.out.println(". " + ipl.next());
        }

        private static int pedirInt() {
                int ip = 0;
                System.out.println();
                while(ip <= 0) {
                        System.out.print("> ");
                        try {
                                ip = Integer.parseInt(sc.nextLine().trim());
                        } catch(NumberFormatException _) {}
                }
                return ip;
        }

        private static String pedirInput() {
                String in = "";
                System.out.println();
                while(in.isBlank()) {
                        System.out.print("> ");
                        in = sc.nextLine().trim();
                }
                return in;
        }

        private static void pedirEnter() {
                System.out.print("(Pulse Enter para continuar...) ");
                sc.nextLine();
        }

        private static void imprTitulo() {
                System.out.println();
                System.out.println();
                System.out.println("REPRODUCTOR DE MÚSICA");
                System.out.println("---------------------");
        }

        private static void imprAlbumes() {
                for(Album a : biblioteca)
                        imprAlbum(a);
        }

        private static void imprAlbum(Album a) {
               for(String i : a.toArrayListString())
                       System.out.println(i);
        }

        private static void imprComandos() {
                System.out.println();
                System.out.println("Introduzca un comando:");
                System.out.println("0. Salir");
                System.out.println("1. Siguiente canción");
                System.out.println("2. Anterior canción");
                System.out.println("3. Reproducir de nuevo");
                System.out.println("4. Mostrar playlist");
                System.out.println("5. Borrar canción de la playlist");
        }

        private static void imprSalir() {
                System.out.println("Saliendo del programa...");
                System.out.println();
        }

        private static void inicAlbumes() {
                Album vdm = new Album("Violator", "Depeche Mode");
                Album mkw = new Album("Mario Kart World", "Nintendo");

                vdm.addCancion("Enjoy the Silence", 240);
                vdm.addCancion("World in My Eyes", 200);
                vdm.addCancion("Clean", 180);
                vdm.addCancion("Policy of Truth", 160);

                mkw.addCancion("Main Theme", 120);
                mkw.addCancion("Overworld (Super Mario Bros.)", 175);
                mkw.addCancion("Athletic Theme (Super Mario World)", 190);
                mkw.addCancion("Rainbow Road (Mario Kart 64)", 178);
                mkw.addCancion("Sunshine Airport (Mario Kart 8)", 150);
                mkw.addCancion("Gusty Garden Galaxy", 165);

                biblioteca = new ArrayList<>();
                biblioteca.add(vdm);
                biblioteca.add(mkw);
        }

        private static void inicPlaylist() {
                Album a1 = biblioteca.get(0);
                Album a2 = biblioteca.get(1);

                playlist = new LinkedList<>();

                a1.addToPlaylist(0, playlist);
                a1.addToPlaylist(1, playlist);
                a1.addToPlaylist(3, playlist);

                a2.addToPlaylist(1, playlist);
                a2.addToPlaylist(2, playlist);
                a2.addToPlaylist(3, playlist);
                a2.addToPlaylist(4, playlist);
        }
}
