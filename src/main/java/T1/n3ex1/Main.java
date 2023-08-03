package T1.n3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Redactor> redactores = new ArrayList<>();

        Redactor r1 = new Redactor("Juan", "73862921P");
        Redactor r2 = new Redactor("Pepe", "13799073Q");
        Redactor r3 = new Redactor("Martha", "69270711R");

        redactores.add(r1);
        redactores.add(r2);
        redactores.add(r3);

        ArrayList<Noticia> noticias = new ArrayList<>();

        Noticia n1 = new Futbol("Mbappe al Real", "Liga de campeones", "Real madrid", "Mbappe");
        Noticia n2 = new Baloncesto("Gasol se retira", "abc", "Gasol");
        Noticia n3 = new Tenis("Alcaraz numero 1", "Wimbledon", "Alcaraz");
        Noticia n4 = new F1("Lewis campeón", "Mercedes");
        Noticia n5 = new Motociclismo("Marquez al suelo", "Honda");
        Noticia prueba = new Futbol("prueba", "Liga de campeones", "Barça", "Ferran Torres");
        prueba.setTexto("El gol de ferran, jugador del barça en la liga de campeones, calculando precio, deberia ser 550€");

        r1.getNoticias().add(prueba);

        noticias.add(n1);
        noticias.add(n2);
        noticias.add(n3);
        noticias.add(n4);
        noticias.add(n5);

        boolean salir = false;
        do {
            switch (menu()) {
                case 1:
                    introducirRedactor(redactores);
                    break;
                case 2:
                    eliminarRedactor(redactores);
                    break;
                case 3:
                    introducirNoticiaRedactor(redactores);
                    break;
                case 4:
                    eliminarNoticia(redactores);
                    break;
                case 5:
                    mostrarNoticiasPorRedactor(redactores);
                    break;
                case 6:
                    calcularPuntuacionNoticia(redactores);
                    break;
                case 7:
                    calcularPrecioNoticia(redactores);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación");
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    public static byte menu() {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 7;

        do {
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Introducir redactor.");
            System.out.println("2. Eliminar redactor.");
            System.out.println("3. Introducir noticia a redactor.");
            System.out.println("4. Eliminar noticia.");
            System.out.println("5. Mostrar todas las noticias del redactor.");
            System.out.println("6. Calcular puntuación de la noticia.");
            System.out.println("7. Calcular precio de la noticia.");
            System.out.println("0. Salir de la aplicación.\n");
            opcion = sc.nextByte();
            if (opcion < MINIMO || opcion > MAXIMO) {
                System.out.println("Escoge una opción válida");
            }
        } while (opcion < MINIMO || opcion > MAXIMO);
        return opcion;
    }

    public static void introducirRedactor(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        if (busquedaRedactor(nombre, dni, redactores) == null) {
            redactores.add(new Redactor(nombre, dni));
            System.out.println("Añadido correctamente: " + nombre + " " + dni);
        } else {
            System.out.println("El " + busquedaRedactor(nombre, dni, redactores) + " ya existe");
        }
    }

    private static Redactor busquedaRedactor(String nombre, String dni, ArrayList<Redactor> redactores) {
        Redactor redactor = null;
        if (redactores != null) {
            for (Redactor r : redactores) {
                if (r.getNombre().equalsIgnoreCase(nombre) && r.getDni().equalsIgnoreCase(dni)) {
                    redactor = r;
                }
            }
        }
        return redactor;
    }

    public static void eliminarRedactor(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        if (redactores != null) {
            if (busquedaRedactor(nombre, dni, redactores) != null) {
                redactores.remove(busquedaRedactor(nombre, dni, redactores));
                System.out.println("Eliminado correctamente: " + nombre + " " + dni);
            } else {
                System.out.println("No se ha encontrado a: " + nombre + " con Dni " + dni);
            }
        } else {
            System.out.println("La lista de redactores está vacía");
        }


    }

    public static void introducirNoticiaRedactor(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        Redactor redactor = busquedaRedactor(nombre, dni, redactores);
        if (redactor != null) {
            System.out.println("Introduzca el titular");
            String titular = sc.nextLine();
            if (busquedaNoticia(redactor, titular) == null) {
                redactor.getNoticias().add(new Noticia(titular));
                System.out.println("Se añadió la noticia '" + titular + "' al " + redactor);
            } else {
                System.out.println("Ese titular ya existe");
            }
        } else {
            System.out.println("Ese redactor no existe");
        }

    }

    private static Noticia busquedaNoticia(Redactor redactor, String titular) {
        Noticia noticia = null;
        if (redactor.getNoticias() != null) {
            for (Noticia n : redactor.getNoticias()) {
                if (n.getTitular().equalsIgnoreCase(titular)) {
                    noticia = n;
                }
            }
        }
        return noticia;
    }

    public static void eliminarNoticia(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        Redactor redactor = busquedaRedactor(nombre, dni, redactores);
        if (redactor != null) {
            System.out.println("Introduzca el titular");
            String titular = sc.nextLine();
            if (busquedaNoticia(redactor, titular) != null) {
                redactor.getNoticias().remove(busquedaNoticia(redactor, titular));
            } else {
                System.out.println("No pudimos encontrar esa noticia");
            }
        }
    }

    public static void mostrarNoticiasPorRedactor(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        Redactor redactor = busquedaRedactor(nombre, dni, redactores);
        for (Noticia n : redactor.getNoticias()) {
            System.out.println(n);
        }
    }

    public static void calcularPuntuacionNoticia(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        Redactor redactor = busquedaRedactor(nombre, dni, redactores);
        if (redactor == null) {
            System.out.println("El redactor no existe");
        } else {
            System.out.println("Introduzca el titular");
            String titular = sc.nextLine();
            Noticia noticia = busquedaNoticia(redactor, titular);
            if (noticia == null) {
                System.out.println("No encontramos ese titular");
            } else {
                int puntuacion = noticia.calcularPuntuacionNoticia(noticia);
                System.out.println("La puntuación de la noticia es de " + puntuacion);
            }
        }
    }

    public static void calcularPrecioNoticia(ArrayList<Redactor> redactores) {
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca DNI");
        String dni = sc.nextLine();
        Redactor redactor = busquedaRedactor(nombre, dni, redactores);
        if (redactor == null) {
            System.out.println("El redactor no existe");
        } else {
            System.out.println("Introduzca el titular");
            String titular = sc.nextLine();
            Noticia noticia = busquedaNoticia(redactor, titular);
            if (noticia == null) {
                System.out.println("No encontramos ese titular");
            } else {
                double precio = noticia.calcularPrecioNoticia(noticia);
                System.out.println("El precio de la noticia es de " + precio);
            }
        }
    }
}