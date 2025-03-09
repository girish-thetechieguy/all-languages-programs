/**
 * Notes:
 * Polymorphism allows methods to do different things based on the object that it is acting upon.
 */

// Base class
class _04_Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived classes
class _04_Dog extends _04_Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class _04_Cat extends _04_Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class _04_polymorphism {
    public static void main(String[] args) {
        _04_Animal myDog = new _04_Dog();
        _04_Animal myCat = new _04_Cat();

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
