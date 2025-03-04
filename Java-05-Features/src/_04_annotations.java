
/**
 * Note: Annotations provide a way to add metadata to Java code, which can be processed at compile-time or runtime.
 */



import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

public class _04_annotations {
    @MyAnnotation("Example annotation")
    public void myMethod() {
        System.out.println("My method with annotation.");
    }

    public static void main(String[] args) throws Exception {
        _04_annotations demo = new _04_annotations();
        demo.myMethod();

        // Accessing the annotation
        MyAnnotation annotation = demo.getClass().getMethod("myMethod").getAnnotation(MyAnnotation.class);
        System.out.println("Annotation value: " + annotation.value());
    }
}
