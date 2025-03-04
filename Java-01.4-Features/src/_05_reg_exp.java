/**
 * Note: introduced support for regular expressions in the java.util.regex package, allowing for powerful string manipulation and pattern matching.
 */

import java.util.regex.*;

public class _05_reg_exp {
    public static void main(String[] args) {
        String input = "Hello 123, this is a test 456.";
        Pattern pattern = Pattern.compile("\\d+"); // Pattern to match digits
        Matcher matcher = pattern.matcher(input);

        System.out.println("Found numbers:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Print matched numbers
        }
    }
}

