import java.util.concurrent.Executors;
public class _01_VirtualThreads {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                System.out.println("Running in a virtual thread");
            });
            System.out.println("Virtual thread created.");
        }
    }
}
