import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class _18_OrderedTestsDemoTest {
    @Test
    @Order(1)
    void nullValues() {
        // perform assertions against null values
    }

    @Test
    @Order(2)
    void emptyValues() {
        // perform assertions against empty values
    }

    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }

    @Nested
    @Order(4)
    class PrimaryTests {

        @Test
        void test1() {
        }
    }

    @Nested
    @Order(5)
    class SecondaryTests {

        @Test
        void test2() {
        }
    }
}
