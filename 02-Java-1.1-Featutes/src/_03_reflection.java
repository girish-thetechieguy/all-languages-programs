import java.lang.reflect.Method;

class MyClass {
    public void display() {
        System.out.println("Hello from MyClass!");
    }
}

public class _03_reflection {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        // Getting the class object
        Class<?> clazz = obj.getClass();
        // Getting the display method
        Method method = clazz.getMethod("display");
        // Invoking the method
        method.invoke(obj); // Output: Hello from MyClass!
    }
}
