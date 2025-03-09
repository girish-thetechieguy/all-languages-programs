/**
 * Implementing Runnable:
 * This method provides more flexibility, as it allows you to implement
 * multiple threads with a single Runnable instance.
 */

/**
 * While Java 1.0 introduced multithreading,
 *  it is essential to manage thread synchronization and communication carefully in more complex applications
 *  to avoid issues such as race conditions and deadlocks. Advanced features like synchronized, wait(), notify(),
 *  and notifyAll() are used in later versions for better thread management.
 */


// Custom Runnable class
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class _08_multithreading_implements {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
}


