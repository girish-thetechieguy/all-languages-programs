// Class representing a simple object
class MyClass {
    private String name;

    // Constructor
    public MyClass(String name) {
        this.name = name;
        System.out.println("Creating object: " + name);
    }

    // Method to display object information
    public void display() {
        System.out.println("Object name: " + name);
    }

    // Finalizer method (not commonly used in modern Java)
    protected void finalize() {
        System.out.println("Finalizing object: " + name);
    }
}

public class _07_auto_memory_management {
    public static void main(String[] args) {
        // Creating objects
        MyClass obj1 = new MyClass("Object 1");
        MyClass obj2 = new MyClass("Object 2");

        // Display objects
        obj1.display();
        obj2.display();

        // Nullifying references to objects
        obj1 = null; // obj1 is now eligible for garbage collection
        obj2 = null; // obj2 is now eligible for garbage collection

        // Suggesting garbage collection
        System.gc(); // Requesting JVM to perform garbage collection

        // Adding a delay to observe finalization (not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
