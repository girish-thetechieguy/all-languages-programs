import java.util.List;
import java.util.stream.Collectors;

public class _01_ImprovedSteamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Using takeWhile to take elements while the condition is true
        List<Integer> taken = numbers.stream()
                .takeWhile(n -> n < 4)
                .collect(Collectors.toList());

        System.out.println("Taken elements: " + taken); // Output: [1, 2, 3]
    }
}
