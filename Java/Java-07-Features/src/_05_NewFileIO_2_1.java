import java.nio.file.*;

public class _05_NewFileIO_2_1 {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try {
            // Create a file and write content
            Files.write(path, "Hello, NIO.2!".getBytes(), StandardOpenOption.CREATE);
            System.out.println("File created.");

            // Read the file content
            String content = new String(Files.readAllBytes(path));
            System.out.println("File content: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
