import java.io.*;

public class _02_exception_handling_Impro {
    public static void main(String[] args) {
        // Using try-with-resources to manage resources
        try (BufferedReader br = new BufferedReader(new FileReader("nio.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
