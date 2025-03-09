import java.util.Arrays;
import java.util.List;

public class _04_MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference to print names
        names.forEach(System.out::println);
    }
}
