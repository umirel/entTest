import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SignoTest {

    @Test
    void testNumeroPositivo() {
        assertEquals(1, Signo.signo(5));
    }

    @Test
    void testNumeroNegativo() {
        assertEquals(-1, Signo.signo(-3));
    }

    @Test
    void testCero() {
        assertEquals(0, Signo.signo(0));
    }
}