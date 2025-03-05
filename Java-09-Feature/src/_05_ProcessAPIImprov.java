import java.io.IOException;

public class _05_ProcessAPIImprov {
    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder("echo", "Hello, Process API!").start();
            process.waitFor(); // Wait for the process to complete
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
