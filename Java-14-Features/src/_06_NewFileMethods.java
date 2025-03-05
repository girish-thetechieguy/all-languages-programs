import java.nio.file.Files;
import java.nio.file.Path;

public class _06_NewFileMethods {
    public static void main(String[] args) {
        Path path = Path.of("example.txt");

        try {
            String content = Files.readString(path);
            System.out.println("File content: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
