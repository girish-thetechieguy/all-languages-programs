import java.util.ArrayList;

public class _01_Lang_Enhancement {
    public static void main(String[] args) {
        // Using diamond operator for type inference
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
