import java.io.*;

public class _02_TryWithResources {
    public static void main(String[] args) {
        // Automatically closes BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
