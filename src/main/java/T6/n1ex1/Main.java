package T6.n1ex1;

public class Main {

    public static void main (String[] args){

        String uno = "1";
        String dos = "2";
        String tres = "3";

        NoGenericMethods prueba1 = new NoGenericMethods(uno, dos, tres);
        NoGenericMethods prueba2 = new NoGenericMethods(dos, tres, uno);

        System.out.println(prueba1.getUno() + "\n" + prueba1.getDos() + "\n" + prueba1.getTres());
        System.out.println("Prueba dos" + "\n" + prueba2.getUno() + "\n" + prueba2.getDos() + "\n" + prueba2.getTres());
    }
}
