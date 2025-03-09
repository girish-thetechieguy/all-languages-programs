import java.util.Arrays;
import java.util.List;


public class _01_LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression to print names
        names.forEach(name -> System.out.println(name));
    }
}
