import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class _05_NewFileMethods {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            String content = Files.readString(file.toPath());
            System.out.println("File content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
