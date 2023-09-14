package T5.n1ex5;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante("Juan", 29, "Java", 90);
        estudiantes[1] = new Estudiante("Pedro", 34, "JavaScript", 56);
        estudiantes[2] = new Estudiante("Ana", 26, "PHP", 37);

        System.out.println("Escoja nombre y ubicacion para el archivo");
        String pathToWrite = escogerRuta() + ".ser";

        try {
            ObjectOutputStream ser = new ObjectOutputStream(new FileOutputStream(pathToWrite));
            ser.writeObject(estudiantes);
            ser.close();

            ObjectInputStream des = new ObjectInputStream(new FileInputStream(pathToWrite));
            Estudiante[] estudiantesRecuperados;
            estudiantesRecuperados = (Estudiante[]) des.readObject();
            des.close();

            for (Estudiante e : estudiantesRecuperados) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
