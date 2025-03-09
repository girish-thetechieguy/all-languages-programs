import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _06_ThreadLocTypeInf {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (var i = 0; i < 5; i++) {
            executor.submit(() -> {
                var threadName = Thread.currentThread().getName();
                System.out.println("Running in thread: " + threadName);
            });
        }

        executor.shutdown();
    }
}
