package T1.n1ex2;

public class Coche {
    private static final String marca = "Toyota";
    private static String modelo;
    private final int potencia;

    public Coche(String modelo, int potencia) {
        Coche.modelo = modelo;
        this.potencia = potencia;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    public static String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }
    public static void frenar() {
        System.out.println("El vehiculo está frenando");
    }

    public void acelerar() {
        System.out.println("El vehiculo modelo " + Coche.modelo + " está acelerando");
    }

    public String toString() {
        return "Coche [marca=" + Coche.marca + " modelo=" + Coche.modelo + " potencia=" + potencia + "]";
    }
}
