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
        assertEquals(12, month.getMonths().size());
    }

    @Test
    public void testPosicion() {
        assertEquals(("Agosto"), month.getMonths().get(7));
    }
}