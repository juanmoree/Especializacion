package T5.n1ex5;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private int edad;
    private String curso;
    private int diasParaFinalizar;

    public Estudiante(String nombre, int edad, String curso, int diasParaFinalizar) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.diasParaFinalizar = diasParaFinalizar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public int getDiasParaFinalizar() {
        return diasParaFinalizar;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", curso='" + getCurso() + '\'' +
                ", diasParaFinalizar=" + getDiasParaFinalizar() +
                '}';
    }
}
