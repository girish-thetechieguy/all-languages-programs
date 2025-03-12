import org.junit.jupiter.api.Test;

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

}