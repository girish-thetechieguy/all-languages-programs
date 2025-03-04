/**
 * Note:Java 1.4 introduced the try-with-resources statement,
 * which simplifies resource management and ensures that resources are closed properly.
 */

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
