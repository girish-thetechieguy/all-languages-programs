public class _03_StringUtils {
    // Method to reverse a string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }
}
