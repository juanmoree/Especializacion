package T3.n1ex1;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month [name=" + name + "]";
    }

    // Hashcode y equals generados para asegurarnos de que no hayan duplicados segun
    // el nombre como atributo de objeto.

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Month other = (Month) obj;
        return Objects.equals(name, other.name);
    }
}
