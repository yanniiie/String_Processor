
import org.example.StringProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class StringProcessorTest {

        private final StringProcessor processor = new StringProcessor();

        @Test
        void testIsStrongPassword() {
            assertTrue(processor.isStrongPassword("Abc123!@#"));
            assertFalse(processor.isStrongPassword("abc123"));
            assertFalse(processor.isStrongPassword("ABC123"));
            assertFalse(processor.isStrongPassword("Abc!@#"));
            assertFalse(processor.isStrongPassword("12345678"));
        }

        @Test
        void testCalculateDigits() {
            assertEquals(5, processor.calculateDigits("My phone number is 12345"));
            assertEquals(0, processor.calculateDigits("Hello world!"));
            assertEquals(3, processor.calculateDigits("123 456 789"));
        }

        @Test
        void testCalculateWords() {
            assertEquals(5, processor.calculateWords("This is a test sentence"));
            assertEquals(0, processor.calculateWords(""));
            assertEquals(1, processor.calculateWords("Word"));
        }

        @Test
        void testCalculateExpression() {
            assertEquals(7.0, processor.calculateExpression("3 + 4"));
            assertEquals(12.0, processor.calculateExpression("(2 + 3) * 4"));
            assertThrows(IllegalArgumentException.class, () -> processor.calculateExpression("2 + "));
        }
    }
