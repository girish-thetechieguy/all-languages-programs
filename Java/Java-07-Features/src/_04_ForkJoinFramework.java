import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class _04_ForkJoinFramework extends RecursiveTask<Long> {
    private final long start;
    private final long end;

    public _04_ForkJoinFramework(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= 10) {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long mid = (start + end) / 2;
            _04_ForkJoinFramework task1 = new _04_ForkJoinFramework(start, mid);
            _04_ForkJoinFramework task2 = new _04_ForkJoinFramework(mid + 1, end);
            task1.fork(); // Fork the first task
            return task2.compute() + task1.join(); // Join the results
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        long result = pool.invoke(new _04_ForkJoinFramework(1, 100));
        System.out.println("Sum from 1 to 100: " + result);
    }
}