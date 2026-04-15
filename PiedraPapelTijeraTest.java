import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PiedraPapelTijeraTest {

    @Test
    void testJugadaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            PiedraPapelTijera.jugar("PIEDRA", "FUEGO");
        });
    }

    @Test
    void testEmpate() {
        assertEquals("EMPATE",
            PiedraPapelTijera.jugar("PAPEL", "PAPEL"));
    }

    @Test
    void testGanaJugador1() {
        assertEquals("GANA JUGADOR 1",
            PiedraPapelTijera.jugar("PIEDRA", "TIJERA"));
    }

    @Test
    void testGanaJugador2() {
        assertEquals("GANA JUGADOR 2",
            PiedraPapelTijera.jugar("PAPEL", "TIJERA"));
    }
}