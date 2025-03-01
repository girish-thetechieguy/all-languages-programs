import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class _03_new_ip_op {
    public static void main(String[] args) {
        String content = "Hello, Java NIO!\n";

        try {
            // Writing to a file using NIO
            Files.write(Paths.get("nio.txt"), content.getBytes(), StandardOpenOption.CREATE);
            System.out.println("Content written to nio.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
