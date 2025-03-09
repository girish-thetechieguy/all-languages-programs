/**
 * Note: Which improves performance through adaptive optimization techniques.
 * (This feature is not directly demonstrated in code but affects performance during execution.)
 */

public class _03_hotspot_jvm {
    public static void main(String[] args) {
        // A simple loop to demonstrate performance
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " ns");
    }
}
