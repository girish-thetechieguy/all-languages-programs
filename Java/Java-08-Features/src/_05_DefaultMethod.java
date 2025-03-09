interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}

public class _05_DefaultMethod implements MyInterface {
    public static void main(String[] args) {
        _05_DefaultMethod demo = new _05_DefaultMethod();
        demo.defaultMethod(); // Call the default method
    }
}
