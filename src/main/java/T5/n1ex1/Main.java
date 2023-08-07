package T5.n1ex1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File ruta = new File("C:/Users/camib/Desktop");

        System.out.println("Los archivos en la ruta " + ruta.getAbsolutePath() + " listados en orden alfabético:");

        String[] nombres = ruta.list();

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
