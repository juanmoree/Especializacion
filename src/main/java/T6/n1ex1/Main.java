package T6.n1ex1;

public class Main {

    public static void main (String[] args){

        Object uno = new Object();
        Object dos = new Object();
        Object tres = new Object();

        NoGenericMethods prueba1 = new NoGenericMethods(uno, dos, tres);
        NoGenericMethods prueba2 = new NoGenericMethods(dos, tres, uno);

        System.out.println(prueba1.getDos());
        System.out.println(prueba2.getDos());
    }
}
