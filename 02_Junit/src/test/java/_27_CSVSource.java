import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class _27_CSVSource {
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

    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
    FRUIT,         RANK
    apple,         1
    banana,        2
    'lemon, lime', 0xF1
    strawberry,    700_000
    """)
    void testWithCsvSourceV0(String fruit, int rank) {
        // ...
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|', quoteCharacter = '"', textBlock = """
    #-----------------------------
    #    FRUIT     |     RANK
    #-----------------------------
         apple     |      1
    #-----------------------------
         banana    |      2
    #-----------------------------
      "lemon lime" |     0xF1
    #-----------------------------
       strawberry  |    700_000
    #-----------------------------
    """)
    void testWithCsvSourceV1(String fruit, int rank) {
        // ...
    }

}
