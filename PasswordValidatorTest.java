import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testPasswordDebilCorta() {
        assertEquals("DEBIL",
            PasswordValidator.evaluarPassword("abc"));
    }

    @Test
    void testPasswordSoloLongitud() {
        assertEquals("DEBIL",
            PasswordValidator.evaluarPassword("abcdefgh"));
    }

    @Test
    void testPasswordMedia() {
        assertEquals("MEDIA",
            PasswordValidator.evaluarPassword("abc12345"));
    }

    @Test
    void testPasswordMediaConMayuscula() {
        assertEquals("MEDIA",
            PasswordValidator.evaluarPassword("Abc12345"));
    }

    @Test
    void testPasswordFuerte() {
        assertEquals("FUERTE",
            PasswordValidator.evaluarPassword("Abc12345!"));
    }
}