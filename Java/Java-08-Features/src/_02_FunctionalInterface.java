import java.util.function.Function;

public class _02_FunctionalInterface {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));
    }
}
