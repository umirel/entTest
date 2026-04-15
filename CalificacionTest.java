import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalificacionTest {

    @Test
    void testNotaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calificacion.calificacion(-1);
        });
    }

    @Test
    void testNotaMayor10() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calificacion.calificacion(11);
        });
    }

    @Test
    void testSuspenso() {
        assertEquals("SUSPENSO", Calificacion.calificacion(3));
    }

    @Test
    void testSuficiente() {
        assertEquals("SUFICIENTE", Calificacion.calificacion(5));
    }

    @Test
    void testBien() {
        assertEquals("BIEN", Calificacion.calificacion(6));
    }

    @Test
    void testNotable() {
        assertEquals("NOTABLE", Calificacion.calificacion(7));
    }

    @Test
    void testSobresaliente() {
        assertEquals("SOBRESALIENTE", Calificacion.calificacion(9));
    }
}