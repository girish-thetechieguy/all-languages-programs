/**
 * Notes: Java 1.2 introduced a unified collections framework that provides data structures like lists, sets, and maps.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class _01_collections_framework {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);

        System.out.println("\nHashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
