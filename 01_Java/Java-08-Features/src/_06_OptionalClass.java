import java.util.Optional;

public class _06_OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);

        // Using Optional to avoid null checks
        String value = optionalValue.orElse("Default Value");
        System.out.println("Value: " + value);
    }
}
