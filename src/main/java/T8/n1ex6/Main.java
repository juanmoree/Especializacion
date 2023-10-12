package T8.n1ex6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Juan");
        list.add("Moreno");
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("IT");
        list.add("Academy");

        // Por que con List.of(todos los elementos) no funciona?

        list.sort(Comparator.comparing(x -> x.toString().length()));
        list.forEach(System.out::println);
    }
}
