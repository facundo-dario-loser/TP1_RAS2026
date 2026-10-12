package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testJustoDieciochoAnios() {
        Main programa = new Main();
        // 18 debería dar true, pero por el bug dará false y fallará el test
        assertTrue(programa.esMayorDeEdad(18));
    }
}
