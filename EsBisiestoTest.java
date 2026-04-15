import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EsBisiestoTest {

    @Test
    void testDivisiblePor4NoPor100() {
        assertTrue(EsBisiesto.esBisiesto(2024));
    }

    @Test
    void testDivisiblePor100NoPor400() {
        assertFalse(EsBisiesto.esBisiesto(1900));
    }

    @Test
    void testDivisiblePor400() {
        assertTrue(EsBisiesto.esBisiesto(2000));
    }

    @Test
    void testNoDivisiblePor4() {
        assertFalse(EsBisiesto.esBisiesto(2023));
    }
}