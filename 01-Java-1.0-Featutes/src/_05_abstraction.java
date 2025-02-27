// Abstract class
abstract class Shape {
    abstract void draw(); // Abstract method
}

// Concrete class
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
public class _05_abstraction {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); // Output: Drawing a circle
    }
}
