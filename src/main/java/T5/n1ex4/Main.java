package T5.n1ex4;

import javax.swing.*;
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

        String pathName = escogerRuta();
        File ruta = new File(pathName);
        File[] nombres = ruta.listFiles();
        BasicFileAttributes attrs = Files.readAttributes(ruta.toPath(), BasicFileAttributes.class);



        int i = 0;
        if (nombres != null) {
            System.out.println("Escoja un nombre para el archivo");
            String fileName = sc.nextLine();
            String pathToWrite = pathName + File.separator + fileName + ".txt";
            while (i < nombres.length) {
                if (nombres[i].isDirectory()) {
                    entrarDirectorio(nombres[i], pathToWrite);
                } else {
                    String toWrite = nombres[i] + " (F) " + df.format(attrs.lastModifiedTime().toMillis());
                    escribirEnFichero(pathToWrite, toWrite);
                }
                if (nombres[i].getAbsolutePath().endsWith(".txt")) {
                    readFile(nombres[i]);
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
                if (subNombre[i].getAbsolutePath().endsWith(".txt")) {
                    readFile(subNombre[i]);
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

    private static void readFile(File direccionLectura) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(direccionLectura));
        String linea = br.readLine();

        System.out.println("Direccion de archivo: " + direccionLectura.getAbsolutePath());
        System.out.println("Nombre de archivo de texto: " + direccionLectura.getName());

        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
    }
    private static String escogerRuta() {
        JFileChooser fc = new JFileChooser();
        //fc.setCurrentDirectory(new File("."));
        fc.setDialogTitle("Seleccione la carpeta para listar");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);
        String ruta;
        int respuesta = fc.showOpenDialog(fc);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoElegido = fc.getSelectedFile().getAbsoluteFile();
            ruta = archivoElegido.getAbsolutePath();
            System.out.println("Directorio elegido: " + archivoElegido.getName());
        } else {
            System.out.println("La ruta escogida no es valida");
            ruta = "";
        }
        return ruta;
    }
}
