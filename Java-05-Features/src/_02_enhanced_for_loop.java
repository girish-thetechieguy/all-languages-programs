
/**
 * Note: The enhanced for loop (also known as the "for-each" loop) simplifies iteration over collections and arrays.
 */

import java.util.ArrayList;

public class _02_enhanced_for_loop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
