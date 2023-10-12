package T8.n1ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.reverseOrder;

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

        list.sort(Comparator.comparing(x -> x.toString().length()).reversed());
        list.forEach(System.out::println);
    }
}
