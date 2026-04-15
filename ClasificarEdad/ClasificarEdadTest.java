import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClasificarEdadTest {

    @Test
    void testEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            ClasificarEdad.clasificarEdad(-1);
        });
    }

    @Test
    void testInfancia() {
        assertEquals("Infancia", ClasificarEdad.clasificarEdad(3));
    }

    @Test
    void testNinez() {
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(10));
    }

    @Test
    void testLimiteNinez() {
        assertEquals("Niñez", ClasificarEdad.clasificarEdad(6));
    }

    @Test
    void testAdolescencia() {
        assertEquals("Adolescencia", ClasificarEdad.clasificarEdad(15));
    }

    @Test
    void testJuventud() {
        assertEquals("Juventud", ClasificarEdad.clasificarEdad(20));
    }

    @Test
    void testAdultez() {
        assertEquals("Adultez", ClasificarEdad.clasificarEdad(30));
    }

    @Test
    void testVejez() {
        assertEquals("Vejez", ClasificarEdad.clasificarEdad(65));
    }
}