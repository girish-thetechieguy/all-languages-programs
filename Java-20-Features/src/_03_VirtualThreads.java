
public class _03_VirtualThreads {
    public static void main(String[] args) {
        // Creating a virtual thread
        Runnable task = () -> {
            System.out.println("Running in a virtual thread");
        };

        Thread.ofVirtual().start(task);
        System.out.println("Virtual thread created.");
    }
}
