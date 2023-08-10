package T8.n1ex5;

public class Main {

    public static void main(String[] args){
        MyInterface interfaz = () -> 3.1415;
        System.out.println(interfaz.getPiValue());
    }
}
