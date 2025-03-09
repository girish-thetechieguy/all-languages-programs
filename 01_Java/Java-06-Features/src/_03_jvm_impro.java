public class _03_jvm_impro {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Perform some intensive calculations
        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }
}
