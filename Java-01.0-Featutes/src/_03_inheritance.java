// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Cat extends Animal {
    void meow() {
        System.out.println("The cat says meow.");
    }
}

public class _03_inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat(); // Output: This animal eats food.
        cat.meow(); // Output: The cat says meow.
    }
}
