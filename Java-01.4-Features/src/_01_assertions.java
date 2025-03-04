/**
 * Note:The assertion mechanism allows developers to test assumptions about their program.
 * Assertions can be enabled or disabled at runtime.
 */

public class _01_assertions {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Assertion to check if x is greater than y
        assert x > y : "Assertion failed: x should be greater than y";

        System.out.println("Assertion passed. x is greater than y.");
    }
}
