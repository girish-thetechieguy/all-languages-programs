public class _04_PatternMatchInstanceOf {
    public static void main(String[] args) {
        Object obj = "Hello, Java 14!";

        // Using pattern matching with instanceof
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a String");
        }
    }
}
