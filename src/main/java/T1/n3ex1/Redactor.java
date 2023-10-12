package T1.n3ex1;

import java.util.ArrayList;

public class Redactor {
    private String nombre;
    private String dni;
    private static double sueldo;
    private ArrayList<Noticia> noticias;

    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        Redactor.sueldo = 1500;
        this.noticias = new ArrayList<Noticia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public static double getSueldo() {
        return sueldo;
    }

    public static void setSueldo(double sueldo) {
        Redactor.sueldo = sueldo;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
