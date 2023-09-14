package T5.n1ex1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main extends Component {
    public static void main(String[] args) {

        System.out.println("Seleccione una carpeta");
        String pathname = escogerRuta();
        File f = new File(pathname);
        String[] nombres = f.list();

        if (nombres != null) {
            System.out.println("Los archivos en la ruta " + f.getAbsolutePath() + " listados en orden alfabético:");

            for (int i = 0; i < nombres.length; i++) {
                System.out.println(nombres[i]);
            }
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
