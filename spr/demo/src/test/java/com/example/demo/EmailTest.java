import com.example.demo.Email.model.Email;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    public void testValidEmail() {
        Email email = new Email();
        email.setEmailAddress("test@example.com");

        assertTrue(email.isValid());
    }

    @Test
    public void testInvalidEmailWithoutAtSymbol() {
        Email email = new Email();
        email.setEmailAddress("testexample.com");

        assertFalse(email.isValid());
    }

    @Test
    public void testInvalidEmailWithoutDotSymbol() {
        Email email = new Email();
        email.setEmailAddress("test@examplecom");

        assertFalse(email.isValid());
    }

    @Test
    public void testInvalidEmailWithoutAtAndDotSymbols() {
        Email email = new Email();
        email.setEmailAddress("testexamplecom");

        assertFalse(email.isValid());
    }

    @Test
    public void testNullEmail() {
        Email email = new Email();
        email.setEmailAddress(null);

        assertFalse(email.isValid());
    }

    @Test
    public void testEmptyEmail() {
        Email email = new Email();
        email.setEmailAddress("");

        assertFalse(email.isValid());
    }
}
