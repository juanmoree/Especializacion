package T5.n1ex1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Escoja ruta a leer");
        String pathname = escogerRuta();
        File f = new File(pathname);

        System.out.println("Los archivos en la ruta " + f.getAbsolutePath() + " listados en orden alfabético:");

        String[] nombres = f.list();

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }

    private static String escogerRuta() {
        Scanner sc = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        String ruta = "";
        try {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return ruta;
    }
}
