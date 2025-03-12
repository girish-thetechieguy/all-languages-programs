/**
 * Note:
 * @DisplayName: Provides a custom display name for the test class or method.
 * @TestMethodOrder(OrderAnnotation.class): Specifies the order in which tests are executed based on method names.
 * @TestInstance(Lifecycle.PER_CLASS): Indicates that a single instance of the test class will be used for all test methods.
 * @BeforeAll: Runs once before all tests in the class.
 * @BeforeEach: Runs before each test method.
 * @Test: Marks a method as a test case.
 * @ParameterizedTest: Indicates that the test method is parameterized and can be run multiple times with different inputs.
 * @ValueSource: Provides a set of values to a parameterized test.
 * @RepeatedTest: Indicates that the test should be run multiple times.
 * @TestFactory: Marks a method that generates dynamic tests.
 * @Nested: Indicates that a test class is nested inside another test class, allowing for better organization of related tests.
 * @AfterEach: Runs after each test method.
 * @AfterAll: Runs once after all tests in the class.
 * @Timeout: (Not used in this example, but can be used) Specifies a timeout for the test method.
 * @TempDir: (Not used in this example, but can be used) Provides a temporary directory to the test method.
 * @ExtendWith: (Not used in this example, but can be used) Allows you to register extensions for your tests.
 * @RegisterExtension: (Not used in this example, but can be used) Registers an extension for the test class.
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.DisplayName;
import java.util.stream.Stream;

@DisplayName("Bank Account Tests")
@TestMethodOrder(OrderAnnotation.class) // Order tests by method name
@TestInstance(Lifecycle.PER_CLASS) // Use a single instance of the test class

class _05_BankAccountTest {
    private _05_BankAccount account;

    @BeforeAll
    void setupAll() {
        System.out.println("Starting Bank Account Tests");
    }

    @BeforeEach
    void setup() {
        account = new _05_BankAccount(100.0); // Initialize with a balance of 100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be 150 after deposit");
    }

    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), "Balance should be 70 after withdrawal");
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, -10.0}) // Test invalid deposits
    void testInvalidDeposit(double amount) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(amount);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @RepeatedTest(3)
    void testRepeatedWithdraw() {
        account.withdraw(10.0);
        assertEquals(90.0, account.getBalance(), "Balance should be 90 after repeated withdrawal");
    }

    @TestFactory
    Stream<DynamicTest> dynamicTests() {
        return Stream.of(
                DynamicTest.dynamicTest("Dynamic Test 1", () -> assertEquals(100.0, account.getBalance())),
                DynamicTest.dynamicTest("Dynamic Test 2", () -> {
                    account.deposit(20.0);
                    assertEquals(120.0, account.getBalance());
                })
        );
    }

    @Nested
    @DisplayName("When the account has insufficient funds")
    class InsufficientFundsTests {

        @BeforeEach
        void setup() {
            account.withdraw(100.0); // Withdraw the entire balance
        }

        @Test
        void testWithdrawMoreThanBalance() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                account.withdraw(10.0);
            });
            assertEquals("Insufficient funds", exception.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test if needed
    }

    @AfterAll
    void tearDownAll() {
        System.out.println("All Bank Account Tests Completed");
    }

}