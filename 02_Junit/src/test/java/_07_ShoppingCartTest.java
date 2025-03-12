import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shopping Cart Tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class _07_ShoppingCartTest {
    private _07_ShoppingCart cart;

    @BeforeAll
    void setupAll() {
        System.out.println("Starting Shopping Cart Tests");
    }

    @BeforeEach
    void setup() {
        cart = new _07_ShoppingCart(); // Initialize a new ShoppingCart before each test
    }

    @Test
    void testAddProduct() {
        _06_Product product = new _06_Product("Laptop", 999.99);
        cart.addProduct(product);
        assertEquals(1, cart.getProducts().size(), "Cart should contain one product");
    }

    @Test
    void testRemoveProduct() {
        _06_Product product = new _06_Product("Smartphone", 499.99);
        cart.addProduct(product);
        cart.removeProduct(product);
        assertEquals(0, cart.getProducts().size(), "Cart should be empty after removal");
    }

    @Test
    void testCalculateTotal() {
        cart.addProduct(new _06_Product("Laptop", 999.99));
        cart.addProduct(new _06_Product("Smartphone", 499.99));
        assertEquals(1499.98, cart.calculateTotal(), "Total should be 1499.98");
    }

//    private static Stream<_06_Product> invalidProductProvider() {
//        return Stream.of(null); // Testing with a null product
//    }
//
//    @ParameterizedTest
//    @MethodSource("invalidProductProvider")
//    void testAddNullProduct(_06_Product product) {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            cart.addProduct(product);
//        });
//        assertEquals("Product cannot be null", exception.getMessage());
//    }

    @Test
    void testRemoveNonExistentProduct() {
        _06_Product product = new _06_Product("Tablet", 299.99);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.removeProduct(product);
        });
        assertEquals("Product not found in cart", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test if needed
    }

    @AfterAll
    void tearDownAll() {
        System.out.println("All Shopping Cart Tests Completed");
    }

}