import java.util.concurrent.*;

public class _02_StructuredConcurrency {
    public static void main(String[] args) {
        try (var scope = Executors.newVirtualThreadPerTaskExecutor()) {
            var task1 = scope.submit(() -> {
                System.out.println("Task 1 running");
                return "Result from Task 1";
            });
            var task2 = scope.submit(() -> {
                System.out.println("Task 2 running");
                return "Result from Task 2";
            });

            System.out.println(task1.get());
            System.out.println(task2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks submitted.");
    }
}
