// WHY:    This helps in logically grouping classes.

class OuterClass {
    private String outerField = "Outer field";

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
}

public class _01_inner_classes {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Output: Accessing: Outer field
    }
}
