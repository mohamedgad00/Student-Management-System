package softwareproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegisterFormTest {

    @Test
    public void testHashPassword() {
        String password = "mypassword";
        String result = RegisterForm.hashPassword(password);

        assertNotNull(result, "Hashed password should not be null");
        assertFalse(result.isEmpty(), "Hashed password should not be empty");

        // Optional: check fixed hash value if you know the algorithm output
        // String expected = "someHashedValue";
        // assertEquals(expected, result);
    }

    @Test
    public void testClearForm() {
        RegisterForm form = new RegisterForm();
        
        // Simulate input
        form.getFnametxt().setText("John");
        form.getLnametxt().setText("Doe");
        form.getUsernametxt().setText("johndoe");
        form.getPasswordtxt().setText("1234");

        // Clear and test
        form.clearForm();
        assertEquals("", form.getFnametxt().getText());
        assertEquals("", form.getLnametxt().getText());
        assertEquals("", form.getUsernametxt().getText());
        assertEquals("", new String(form.getPasswordtxt().getPassword()));

    }

    // You can delete this unless you're testing GUI startup
    // @Test
    // public void testMain() {
    //     String[] args = null;
    //     RegisterForm.main(args);
    //     // No assertion needed, GUI test is optional
    // }
}
