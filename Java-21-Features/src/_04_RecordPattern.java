record Person(String name, int age) {}

public class _04_RecordPattern {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Pattern matching with records
        if (person instanceof Person(String name, int age)) {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}
