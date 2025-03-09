import java.util.Optional;

public class _02_NonThrowingOptionalMethod {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.of("Hello, Java 12!");

        String result = String.valueOf(optional1.or(() -> optional2));
        System.out.println("Result: " + result);
    }
}
