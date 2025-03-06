public class _03_PatternMatchingSwitch {
    public static void main(String[] args) {
        Object obj = "Apple";

        String result = switch (obj) {
            case String s -> "It's a string: " + s;
            case Integer i -> "It's an integer: " + i;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
