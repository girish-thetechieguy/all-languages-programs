public class _03_hotspor_jvm {
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
