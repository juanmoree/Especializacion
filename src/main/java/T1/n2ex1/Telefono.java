package T1.n2ex1;

public class Telefono {
    private String marca;
    private String modelo;

    public Telefono (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(String numero) {
        long num = Long.parseLong(numero);

        System.out.println("Se está llamando al numero: " + num);
    }
}
