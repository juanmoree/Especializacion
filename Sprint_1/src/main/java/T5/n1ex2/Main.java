package T5.n1ex2;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

    static DateFormat df = new SimpleDateFormat("MMMM dd, yyyy hh:mm a ");

    public static void main(String[] args) throws IOException {
        String pathName = escogerRuta();
        File ruta = new File(pathName);
        File[] nombres = ruta.listFiles();
        BasicFileAttributes attrs = Files.readAttributes(ruta.toPath(), BasicFileAttributes.class);


        if (nombres != null) {
            int i = 0;
            while (i < nombres.length) {
                if (nombres[i].isDirectory()) {
                    entrarDirectorio(nombres[i]);
                } else {
                    System.out.println((nombres[i] + " (F) " + df.format(attrs.lastModifiedTime().toMillis())));
                }
                i++;
            }
        }
    }

    public static void entrarDirectorio(File nombreDirectorio) throws IOException {
        File otraRuta = new File(nombreDirectorio.getAbsolutePath());
        File[] subNombre = otraRuta.listFiles();
        BasicFileAttributes attrs = Files.readAttributes(otraRuta.toPath(), BasicFileAttributes.class);
        System.out.println(nombreDirectorio + " (D) " + df.format(attrs.lastModifiedTime().toMillis()));
        int i = 0;
        while (i < subNombre.length) {
            if (subNombre[i].isDirectory()) {
                entrarDirectorio(subNombre[i]);
            } else {
                System.out.println(subNombre[i] + " (F) " + df.format(attrs.lastModifiedTime().toMillis()));
            }
            i++;
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
