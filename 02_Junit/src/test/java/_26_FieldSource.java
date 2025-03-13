import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class _26_FieldSource {

    static final String[] arrayOfFruits = { "apple", "banana" };
    static final List<String> listOfFruits = Arrays.asList("apple", "banana");

    @ParameterizedTest
    @FieldSource
    void arrayOfFruits(String fruit) {
       // assertFruit(fruit);
    }


    @ParameterizedTest
    @FieldSource("listOfFruits")
    void singleFieldSource(String fruit) {
      //  assertFruit(fruit);
    }

    @ParameterizedTest
    @FieldSource("stringIntAndListArguments")
    void testWithMultiArgFieldSource(String str, int num, List<String> list) {
        assertEquals(5, str.length());
        assertTrue(num >=1 && num <=2);
        assertEquals(2, list.size());
    }

    static List<Arguments> stringIntAndListArguments = Arrays.asList(
            arguments("apple", 1, Arrays.asList("a", "b")),
            arguments("lemon", 2, Arrays.asList("x", "y"))
    );


}
