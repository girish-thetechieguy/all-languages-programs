import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _07_NewCollectorImpl {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // Collecting names into a map
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));

        System.out.println("Name Length Map: " + nameLengthMap);
    }
}
