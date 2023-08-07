package T8.n1ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("murcielago", "hola", "probando", "1", "2", "Joan", "Hola mundo!", "prueba1", "prueba2");

        list = list.stream()
                // 'x' es el "consumidor"
                .filter(x -> x.contains("o") || x.contains("O"))
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        list.forEach(x -> System.out.println(x));
    }
}
