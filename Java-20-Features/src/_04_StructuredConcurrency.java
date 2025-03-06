import java.util.concurrent.*;

public class _04_StructuredConcurrency {
    public static void main(String[] args) {
        // Using structured concurrency
        try (var scope = Executors.newVirtualThreadPerTaskExecutor()) {
            scope.submit(() -> {
                System.out.println("Task 1 running");
                return "Result from Task 1";
            });
            scope.submit(() -> {
                System.out.println("Task 2 running");
                return "Result from Task 2";
            });
        }
        System.out.println("All tasks submitted.");
    }
}
