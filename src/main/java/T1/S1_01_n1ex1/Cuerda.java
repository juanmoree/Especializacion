package T1.S1_01_n1ex1;

public class Cuerda extends Instrumento{

    private final String nombre;
    private final double precio;

    public Cuerda(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void tocar () {
        System.out.println("Está sonando un instrumento de cuerda");
    }

    @Override
    public String toString() {
        return "Cuerda{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
