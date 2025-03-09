import java.nio.file.*;

public class _04_new_io_2 {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try {
            // Create a file and write content
            Files.write(path, "Hello, NIO.2!".getBytes(), StandardOpenOption.CREATE);
            System.out.println("File created and content written.");

            // Read the file content
            String content = new String(Files.readAllBytes(path));
            System.out.println("File content: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
