package T1.S1_01_n1ex1;

public class Percusion extends Instrumento {
    private final String nombre;
    private final double precio;

    public Percusion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void tocar() {
        System.out.println("Está sonando un instrumento de percusión");
    }

    @Override
    public String toString() {
        return "Percusion{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
