import java.util.Arrays;
import java.util.List;
public class _02_LocVarSyntexForLambdaPar {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using var in lambda parameters
        names.forEach((var name) -> System.out.println(name));
    }
}
