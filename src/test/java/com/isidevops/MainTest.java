package isidevops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.factorial(-1);
        });
        assertEquals("Le nombre doit être positif ou nul.", exception.getMessage());
    }
}
