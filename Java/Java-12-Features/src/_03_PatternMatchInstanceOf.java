public class _03_PatternMatchInstanceOf {
    public static void main(String[] args) {
        Object obj = "Hello, Java 12!";

        // Using pattern matching with instanceof
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a String");
        }
    }
}
