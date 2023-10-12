package T4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsTest {
    OutOfBounds test;
    @BeforeEach
    void setUp() {
        test = new OutOfBounds();
    }

    @Test()
    void test() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                test.method();
            }
        });
    }
}