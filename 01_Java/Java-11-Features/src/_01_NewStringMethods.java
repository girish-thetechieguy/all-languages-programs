public class _01_NewStringMethods {
    public static void main(String[] args) {
        String text = "   Hello, Java 11!   ";

        // Using new String methods
        System.out.println("Is blank: " + text.isBlank());
        System.out.println("Stripped: '" + text.strip() + "'");
        System.out.println("Lines:");

        text.lines().forEach(System.out::println);
    }
}
