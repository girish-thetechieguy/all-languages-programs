public class _05_EnhancedStringClass {
    public static void main(String[] args) {
        String text = "   Hello, Java 10!   ";

        // Using new String methods
        System.out.println("Is blank: " + text.isBlank());
        System.out.println("Stripped: '" + text.strip() + "'");
        System.out.println("Lines:");

        text.lines().forEach(System.out::println);
    }
}
