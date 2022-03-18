import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @RepeatedTest(value = 50, name = "#{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Random Tester")
    void guessingNumberGame() {
        int value1 = Main.numberGeneratorTest();
        assertTrue(value1 < 21 && value1 > 0, "number was not between 1 and 20");
    }
}