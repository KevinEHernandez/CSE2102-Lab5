import com.example.demo.Password.model.Password;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    public void testStrongPassword() {
        Password password = new Password();
        password.setPasswd("StrongPassword123");

        assertEquals("Strong", password.getPasswordStrength());
    }

    @Test
    public void testWeakPassword() {
        Password password = new Password();
        password.setPasswd("Weak");

        assertEquals("Weak", password.getPasswordStrength());
    }

    @Test
    public void testNullPassword() {
        Password password = new Password();
        password.setPasswd("e");

        assertEquals("Weak", password.getPasswordStrength());
    }

    @Test
    public void testEmptyPassword() {
        Password password = new Password();
        password.setPasswd("");

        assertEquals("Weak", password.getPasswordStrength());
    }

    @Test
    public void testPasswordLengthEdgeCase() {
        Password password = new Password();
        password.setPasswd("1234");

        assertEquals("Weak", password.getPasswordStrength());
    }
}
