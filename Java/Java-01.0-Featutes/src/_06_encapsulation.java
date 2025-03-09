/**
 * Notes:
 * Encapsulation restricts direct access to some of an object’s components and can prevent the accidental modification of data.
 */

class Person {
    private String name; // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class _06_encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice"); // Using setter to set value
        System.out.println("Name: " + person.getName()); // Output: Name: Alice
    }
}
