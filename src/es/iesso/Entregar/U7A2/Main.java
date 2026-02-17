package es.iesso.Entregar.U7A2;

import java.util.*;

public class Main {

        private static final Scanner sc = new Scanner(System.in);

        private static Cancion cActual = null;
        private static ArrayList<Album> biblioteca;
        private static LinkedList<Cancion> playlist;
        private static ListIterator<Cancion> repro;
        private static int dirRepro;

        static void main() {
                boolean seguir = true;
                inicAlbumes();
                playlist = new LinkedList<>();
                inicPlaylist();
                repro = playlist.listIterator();
                imprTitulo();
                imprAlbumes();
                while(seguir)
                        seguir = ejecBucleMenu();
                imprSalir();
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
                        default -> System.out.println("Error: comando no detectado");
                }
                if(seguir) {
                        System.out.println();
                        pedirEnter();
                }
                return seguir;
        }

        private static void menuSiguiente() {
                if(dirRepro == -1)
                        repro.next();
                if(repro.hasNext()) {
                        cActual = repro.next();
                        reproducir(cActual);
                        dirRepro = 1;
                } else
                        System.out.println("No hay canción siguiente");
        }

        private static void menuAnterior() {
                if(dirRepro == 1)
                        repro.previous();
                if(repro.hasPrevious()) {
                        cActual = repro.previous();
                        reproducir(cActual);
                        dirRepro = -1;
                } else
                        System.out.println("No hay canción anterior");
        }

        private static void menuRepetirCancion() {
                System.out.println(cActual);
        }

        private static void menuImprPlaylist() {
                imprPlaylist();
        }

        private static void imprPlaylist() {
                int i = 1;
                Iterator<Cancion> ipl = playlist.iterator();
                System.out.println("Playlist:");
                if(playlist.isEmpty())
                        System.out.println("(vacía)");
                while(ipl.hasNext()) {
                        System.out.println(". " + ipl.next());
                        i++;
                }
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

        private static void reproducir(Cancion c) {
                System.out.println("Reproduciendo " + c);
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
                System.out.println();
                //imprAlbum();
                // TODO
        }

        private static void imprAlbum(Album a) {
                ArrayList<String> ls;
                System.out.println();
                // TODO
        }

        private static void imprComandos() {
                System.out.println();
                System.out.println("Introduzca un comando:");
                System.out.println("0. Salir");
                System.out.println("1. Siguiente canción");
                System.out.println("2. Anterior canción");
                System.out.println("3. Reproducir de nuevo");
                System.out.println("4. Mostrar playlist");
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

                a1.addToPlaylist(0, playlist);
                a1.addToPlaylist(1, playlist);
                a1.addToPlaylist(3, playlist);

                a2.addToPlaylist(1, playlist);
                a2.addToPlaylist(2, playlist);
                a2.addToPlaylist(3, playlist);
                a2.addToPlaylist(4, playlist);
        }
}
