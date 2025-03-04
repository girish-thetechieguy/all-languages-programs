/**
 * Note: introduced the java.util.concurrent package, which provides high-level concurrency utilities,
 * including thread pools and synchronization mechanisms.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _05_concurrency_utility {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running.");
                try {
                    Thread.sleep(1000); // Simulating work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}
