//Notes:
// Automatic memory management in Java, primarily through garbage collection,
// helps manage memory allocation and deallocation without explicit programmer intervention.
// While Java 1.0 did not have advanced garbage collection techniques,
// it introduced the basic concept of automatic memory management.

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

//Class Definition: The MyClass class has a constructor that initializes the object's name and a method to display that name.
//Finalizer Method: The finalize() method is called by the garbage collector when the object is about to be garbage collected. Note that this method is not commonly used in modern Java, as it has been deprecated in later versions.
//Creating Objects: In the main method, two instances of MyClass are created.
//Nullifying References: The references obj1 and obj2 are set to null, making the objects they were pointing to eligible for garbage collection.
//Requesting Garbage Collection: The System.gc() method is called to suggest that the Java Virtual Machine (JVM) perform garbage collection. However, this is just a suggestion, and the JVM may choose not to perform it immediately.
//Delay: A short delay is added to allow time for the garbage collector to finalize the objects, though it's not guaranteed when it will run.


