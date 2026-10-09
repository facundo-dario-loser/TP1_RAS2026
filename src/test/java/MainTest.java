import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testJustoDieciochoAnios() {
        Main programa = new Main();
        // Con 18 años exactos, DEBERÍA devolver true.
        assertTrue(programa.esMayorDeEdad(18));
    }
}
