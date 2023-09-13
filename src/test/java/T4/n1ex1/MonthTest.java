package T4.n1ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthTest {
    Month month;

    @BeforeEach // Instanciar antes de ejecutar cada metodo
    public void before() {
        month = new Month();
    }

    @Test
    public void testCantidad() {
        if (month.getMonths() != null && month.getMonths().size() == 12) {
            System.out.println("Meses == 12, Lista != null");
        } else {
            System.out.println("La lista es null o tiene menos/mas de 12 meses");
            assertEquals(12, month.getMonths().size());
        }
    }
    @Test
    public void testPosicion() {
        if (month.getMonths().get(7).equalsIgnoreCase("agosto")) {
            System.out.println("El mes 8 corresponde a Agosto");
        } else {
            System.out.println("El mes de Agosto no está bien posicionado");
            fail();
        }
    }
}