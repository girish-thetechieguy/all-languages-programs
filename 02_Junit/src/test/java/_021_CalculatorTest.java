import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class _021_CalculatorTest {
    private _02_Calculator calculator;

    // @BeforeAll runs once before all tests in the class
    @BeforeAll
    static void initAll() {
        System.out.println("Starting Calculator Tests");
    }

    // @BeforeEach runs before each test
    @BeforeEach
    void init() {
        calculator = new _02_Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    // @AfterEach runs after each test
    @AfterEach
    void tearDown() {
        // Clean up resources if needed
    }

    // @AfterAll runs once after all tests in the class
    @AfterAll
    static void tearDownAll() {
        System.out.println("All Calculator Tests Completed");
    }

}