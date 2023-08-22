package T8.n1ex8;

import T8.n1ex8.MyInterface;

public class Main {

    public static void main (String[] args){

        MyInterface reverser = (input) -> {
            StringBuilder reversed = new StringBuilder(input).reverse();
            return reversed.toString();
        };

        String original = "Hola mundo!";
        String reversedStr = reverser.reverse(original);

        System.out.println("This is the original: " + original);
        System.out.println("This is the reversed: " + reversedStr);
    }
}
