
// Sealed class
sealed class Shape permits Circle, Square {
}

final class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

final class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class _01_SealedClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ((Circle) circle).draw();

        Shape square = new Square();
        ((Square) square).draw();
    }
}
