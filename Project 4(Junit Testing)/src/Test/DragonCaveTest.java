import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DragonCaveTest {
    DragonCave dragon;

    @BeforeEach
    void setUp() {
        dragon = new DragonCave();
    }

    @Test
    void getNumber() {
        assertEquals(2,dragon.getNumber(), "You approach the cave... \n It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!");
    }

    @AfterEach
    void tearDown() {
    }
}