package T4;

import java.util.ArrayList;

public class OutOfBounds {
    ArrayList array;

    public void method() {
        array = new ArrayList();
        int i = 1;
        array.get(i);
    }
}
