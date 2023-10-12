package T1.n1ex2;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Yaris", 150);
        Coche coche2 = new Coche("Auris", 135);

        coche1.acelerar();
        // El atributo modelo al ser estático, el coche1 cambiara a modelo "Auris" y "Yaris" desaparecerá.
        coche2.acelerar();
        // No es necesario instanciar para llamar al método, ya que es estático.
        Coche.frenar();

        System.out.println(coche1);
    }
}
