
package softwareproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginFormTest {
    
    public LoginFormTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of hashPassword method, of class LoginForm.
     */
    @Test
    public void testHashPassword() {
        String password = "mypassword";
        String result = LoginForm.hashPassword(password);

        assertNotNull(result, "Hashed password should not be null");
        assertFalse(result.isEmpty(), "Hashed password should not be empty");

        // Optional: check fixed hash value if you know the algorithm output
        // String expected = "someHashedValue";
        // assertEquals(expected, result);
    }

    /**
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
