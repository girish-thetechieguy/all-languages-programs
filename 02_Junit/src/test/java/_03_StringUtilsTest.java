import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class _03_StringUtilsTest {
    private final _03_StringUtils stringUtil = new _03_StringUtils();

    @Test
    public void testReverse() {
        assertEquals("edcba", stringUtil.reverse("abcde"), "Reversing 'abcde' should give 'edcba'");
    }

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(stringUtil.isPalindrome("racecar"), "'racecar' should be a palindrome");
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(stringUtil.isPalindrome("hello"), "'hello' should not be a palindrome");
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue(stringUtil.isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankStrings(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankString(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

}