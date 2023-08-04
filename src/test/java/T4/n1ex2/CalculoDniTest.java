package T4.n1ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

public class CalculoDniTest {

    CalculoDni calc;

    @BeforeEach
    public void before() {
        calc = new CalculoDni();
    }


    //Otra forma de pasar datos
	/*public static Iterable<Object[]> getData(){
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] {"26320453n", 'j', 'N'});
		obj.add(new Object[] {"26734895h", 'H', 'H'});
		obj.add(new Object[] {"55667788a", 'A', 'A'});
		obj.add(new Object[] {"11223344j", 'J', 'J'});
		return obj;
	}*/


    public static List<Arguments> getData(){
        return Arrays.asList(
                Arguments.of("26220433J"),
                Arguments.of("26734895V"),
                Arguments.of("7792301R"),
                Arguments.of("62084568I"),
                Arguments.of("64100653K"),
                Arguments.of("99282240A"),
                Arguments.of("32123910T"),
                Arguments.of("13672416C"),
                Arguments.of("85288354S"),
                Arguments.of("33595579K")

        );
    }

    //El metodo en cuestion se pasa como String, JUnit se encarga de invocarlo, en este caso "getData"

    @ParameterizedTest
    @MethodSource("getData")
    public void testParameterDni(String numDni) {
        if (!calc.calculo(numDni)) {
            Assertions.fail();
        }
    }
}