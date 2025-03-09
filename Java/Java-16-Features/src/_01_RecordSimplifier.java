record Person(String name, int age) {
}

public class _01_RecordSimplifier {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
    }
}
