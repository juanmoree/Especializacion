package T5.n1ex5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante("Juan", 29, "Java", 90);
        estudiantes[1] = new Estudiante("Pedro", 34, "JavaScript", 56);
        estudiantes[2] = new Estudiante("Ana", 26, "PHP", 37);


        String pathName = System.getProperty("user.home") + File.separator + "Desktop" + File.separator;
        System.out.println("Escoja un nombre para el archivo");
        String fileName = sc.nextLine();

        String pathToWrite = pathName + fileName + ".ser";

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
}
