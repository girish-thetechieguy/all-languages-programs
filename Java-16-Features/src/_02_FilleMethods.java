import java.nio.file.Files;
import java.nio.file.Path;

public class _02_FilleMethods {
    public static void main(String[] args) {
        Path path = Path.of("example.txt");

        try {
            // Writing to a file
            Files.writeString(path, "Hello, Java 16!");
            System.out.println("File written.");

            // Reading from a file
            String content = Files.readString(path);
            System.out.println("File content: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
