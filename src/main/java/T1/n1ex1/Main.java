package T1.n1ex1;

public class Main {

    public static void main(String[] args) {

        Instrumento inst1 = new Viento("Flauta", 5.85);
        Instrumento inst7 = new Viento("Gaita", 5.85);
        Instrumento inst2 = new Cuerda("Guitarra", 7.85);
        Instrumento inst3 = new Percusion("Acordeon", 9.99);
        inst1.tocar();
        inst2.tocar();
        inst3.tocar();

        System.out.println(inst1);
        System.out.println(inst3);
        System.out.println(inst2);
    }
}
