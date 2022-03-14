import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    GuessTheNumber n;

    @BeforeEach
    void setUp() {
        n = new GuessTheNumber();

    }

    @Test
    void getNumber() {
        assertEquals(12, n.getNumber(), "Wrong number, Guess Again");
    }

    @AfterEach
    void tearDown() {

    }
}