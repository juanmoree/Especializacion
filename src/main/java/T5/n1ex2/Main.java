package T5.n1ex2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

    static DateFormat df = new SimpleDateFormat("MMMM dd, yyyy hh:mm a ");
    public static void main(String[] args) throws IOException {
        String pathName = "C:" + File.separator + "Users" + File.separator + "camib" + File.separator + "Desktop";
        File ruta = new File(pathName);
        File[] nombres = ruta.listFiles();
        BasicFileAttributes attrs = Files.readAttributes(ruta.toPath(), BasicFileAttributes.class);


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
}
