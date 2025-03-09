interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method.");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private method in interface.");
    }
}

public class _02_PrivateMethodInInterface implements MyInterface{
    public static void main(String[] args) {
        _02_PrivateMethodInInterface demo = new _02_PrivateMethodInInterface();
        demo.defaultMethod();
    }
}
