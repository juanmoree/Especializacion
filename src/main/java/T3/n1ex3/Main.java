package T3.n1ex3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String direccionLectura = "src\\main\\java\\T3\\n1ex3\\countries.txt";
        String direccionEscritura = "src\\main\\java\\T3\\n1ex3\\clasificacion.txt";
        BufferedReader br = null;

        Map<String, String> mapa = new HashMap<>();

        try {
            br = new BufferedReader(new FileReader(direccionLectura));
            String linea = br.readLine();
            leerFichero(br, linea, mapa);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (Exception e) {
            System.out.println("Error de lectura del archivo");
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
            }
        }

        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();

        int points = jugar(nombre, direccionEscritura, mapa);

        escribirEnFichero(direccionEscritura, nombre, points);

    }

    private static int jugar(String nombre, String direccionEscritura, Map<String, String> mapa) {

        // Convierte mapa en ArrayList
        Object[] keys = mapa.keySet().toArray();

        int points = 0;

        for (int i = 0; i < 10; i++) {
            Object key = keys[new Random().nextInt(keys.length)];
            System.out.println("Escribe la capital de: " + key);
            String capital = sc.nextLine();

            if (capital.equalsIgnoreCase(mapa.get(key))) {
                System.out.println("Correcto");
                points++;
            } else {
                System.out.println("Incorrecto");
            }
        }
        return points;

    }

    private static Map<String, String> leerFichero(BufferedReader br, String linea, Map<String, String> mapa)
            throws IOException {

        String capital;
        String pais;
        while (linea != null) {
            String lineas[] = linea.split(" ");
            pais = lineas[0];
            if (pais.isEmpty()) {
                capital = lineas[0];
            } else {
                capital = lineas[1];
                mapa.put(pais, capital);
            }

            linea = br.readLine();
        }
        return mapa;
    }

    private static void escribirEnFichero(String direccionEscritura, String nombre, int points) {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(direccionEscritura, true);
            bw = new BufferedWriter(fw);
            bw.write("El jugador: " + nombre + " ha obtenido: " + points + " puntos" + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (Exception e) {
            System.out.println("Error de escritura del archivo");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
