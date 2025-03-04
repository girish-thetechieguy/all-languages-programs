
/**
 * Note: Generics allow for type-safe data structures and methods, enabling developers to define classes, interfaces,
 * and methods with a placeholder for types.
 */

import java.util.ArrayList;

public class _01_generics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
