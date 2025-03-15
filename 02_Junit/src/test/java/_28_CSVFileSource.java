import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class _28_CSVFileSource {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/two-column.csv", numLinesToSkip = 1)
    void testWithCsvFileSourceFromClasspath(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/two-column.csv", numLinesToSkip = 1)
    void testWithCsvFileSourceFromFile(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }

    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvFileSource(files = "src/test/java/two-column.csv", useHeadersInDisplayName = true)
    void testWithCsvFileSourceAndHeaders(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }


}
