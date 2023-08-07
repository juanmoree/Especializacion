package T5.n1ex3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    static DateFormat df = new SimpleDateFormat("MMMM dd, yyyy hh:mm a ");

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String pathName = System.getProperty("user.home") + File.separator + "Desktop" + File.separator;
        File ruta = new File(pathName);
        File[] nombres = ruta.listFiles();
        BasicFileAttributes attrs = Files.readAttributes(ruta.toPath(), BasicFileAttributes.class);

        System.out.println("Escoja un nombre para el archivo");

        String fileName = sc.nextLine();
        String pathToWrite = pathName + fileName + ".txt";

        int i = 0;
        if (nombres != null) {
            while (i < nombres.length) {
                if (nombres[i].isDirectory()) {
                    entrarDirectorio(nombres[i], pathToWrite);
                } else {
                    String toWrite = nombres[i] + " (F) " + df.format(attrs.lastModifiedTime().toMillis());
                    escribirEnFichero(pathToWrite, toWrite);
                }
                i++;
            }
        } else {
            System.out.println("Carpeta no encontrada");
        }
    }

    public static void entrarDirectorio(File nombreDirectorio, String pathToWrite) throws IOException {
        File otraRuta = new File(nombreDirectorio.getAbsolutePath());
        File[] subNombre = otraRuta.listFiles();
        BasicFileAttributes attrs = Files.readAttributes(otraRuta.toPath(), BasicFileAttributes.class);
        String toWrite = nombreDirectorio + " (D) " + df.format(attrs.lastModifiedTime().toMillis());
        escribirEnFichero(pathToWrite, toWrite);
        
        int i = 0;
        if (subNombre != null) {
            while (i < subNombre.length) {
                if (subNombre[i].isDirectory()) {
                    entrarDirectorio(subNombre[i], pathToWrite);
                } else {
                    toWrite = (subNombre[i] + " (F) " + df.format(attrs.lastModifiedTime().toMillis()));
                    escribirEnFichero(pathToWrite, toWrite);
                }
                i++;
            }
        } else {
            System.out.println("Subcarpeta no encontrada");
        }
    }

    private static void escribirEnFichero(String direccionEscritura, String aEscribir) {
        FileWriter fw;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(direccionEscritura, true);
            bw = new BufferedWriter(fw);
            bw.write(aEscribir + "\n");
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
