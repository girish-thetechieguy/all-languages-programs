import java.nio.file.Files;
import java.nio.file.Path;

public class _04_NewFilesMethods {
    public static void main(String[] args) {
        Path filePath = Path.of("example.txt");

        // Writing to a file
        try {
            Files.writeString(filePath, "Hello, Java 11!");
            System.out.println("File written.");

            // Reading from a file
            String content = Files.readString(filePath);
            System.out.println("File content: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
