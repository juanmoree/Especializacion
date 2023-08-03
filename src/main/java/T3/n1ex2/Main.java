package T3.n1ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> reversed = new ArrayList<Integer>();

        ListIterator<Integer> it = myList.listIterator(myList.size());

        // Usando iterador para agregar en orden inverso (hasPrevious)
        while (it.hasPrevious()) {
            reversed.add(it.previous());
        }
        System.out.println(reversed);
    }
}
