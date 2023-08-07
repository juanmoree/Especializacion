package T6.n1ex2;

public class Main {
    public static void main(String[] args){
        GenericMethods prueba1 = new GenericMethods(new Persona("Juan", "Moreno", 29), "StringPrueba", 29);
        GenericMethods prueba2 = new GenericMethods(2, 1, 3);
        GenericMethods prueba3 = new GenericMethods("Hola", "Mundo", new Persona("Pepe", "Perez", 33));

        System.out.println(prueba1 + "\n" + prueba2 + "\n" + prueba3);
    }
}
