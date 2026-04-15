import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContarPositivosTest {

    @Test
    void testArrayVacio() {
        int[] datos = {};
        assertEquals(0, ContarPositivos.contarPositivos(datos));
    }

    @Test
    void testTodosNegativos() {
        int[] datos = {-3, -1, -7};
        assertEquals(0, ContarPositivos.contarPositivos(datos));
    }

    @Test
    void testMezclaValores() {
        int[] datos = {-2, 0, 5, 3, -1};
        assertEquals(2, ContarPositivos.contarPositivos(datos));
    }
}