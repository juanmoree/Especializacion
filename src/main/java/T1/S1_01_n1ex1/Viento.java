package T1.S1_01_n1ex1;

public class Viento extends Instrumento {
    private String nombre;
    private double precio;

    public Viento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void tocar() {
        System.out.println("Está sonando un instrumento de viento");
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Viento{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
