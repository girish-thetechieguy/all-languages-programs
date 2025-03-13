import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class _02_CalculatorTest {
    private final _02_Calculator calculator = new _02_Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void failsDueToUncaughtAssertionError() {
        // The following incorrect assertion will cause a test failure.
        // The expected value should be 2 instead of 99.
        assertEquals(99, calculator.add(1, 1));
    }

    @Test
    void testExpectedExceptionIsThrown() {
        // The following assertion succeeds because the code under assertion
        // throws the expected IllegalArgumentException.
        // The assertion also returns the thrown exception which can be used for
        // further assertions like asserting the exception message.
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    throw new IllegalArgumentException("expected message");
                });
        assertEquals("expected message", exception.getMessage());

        // The following assertion also succeeds because the code under assertion
        // throws IllegalArgumentException which is a subclass of RuntimeException.
        assertThrows(RuntimeException.class, () -> {
            throw new IllegalArgumentException("expected message");
        });
    }

    @Test
    void testExceptionIsNotThrown() {
        assertDoesNotThrow(() -> {
            shouldNotThrowException();
        });
    }

    void shouldNotThrowException() {
    }

}