/**
 * Note: Varargs allow a method to accept a variable number of arguments, making method calls more flexible.
 */

public class _03_varargs {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5); // Passing variable number of arguments
    }

    // Method with varargs
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
