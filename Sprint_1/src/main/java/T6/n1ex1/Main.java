package T6.n1ex1;

public class Main {

    public static void main (String[] args){

        Object uno = new Object();
        Object dos = new Object();
        Object tres = new Object();

        NoGenericMethods prueba1 = new NoGenericMethods("juan", 3.5f, 1);
        NoGenericMethods prueba2 = new NoGenericMethods(dos, tres, uno);

        System.out.println(prueba1.getUno() + "\n" + prueba1.getDos() + "\n" + prueba1.getTres());
        //System.out.println(prueba2.getDos());
    }
}
