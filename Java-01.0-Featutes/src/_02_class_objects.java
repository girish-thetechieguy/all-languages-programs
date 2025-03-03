//Notes:
//A class is a blueprint for creating objects, and an object is an instance of a class.

// Class definition
class Dog {
    String name;
    int age;

    // Method to display dog details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class _02_class_objects {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // Creating an object
        dog1.name = "Buddy";
        dog1.age = 3;
        dog1.display(); // Output: Name: Buddy, Age: 3
    }
}
