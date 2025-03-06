import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class _02_SequencedCollection {
    public static void main(String[] args) {
        List<String> sequencedList = new ArrayList<>();
        sequencedList.add("One");
        sequencedList.add("Two");
        sequencedList.add("Three");

        System.out.println("Sequenced List: " + sequencedList);

        // Using LinkedList as a sequenced collection
        LinkedList<String> sequencedLinkedList = new LinkedList<>();
        sequencedLinkedList.add("A");
        sequencedLinkedList.add("B");
        sequencedLinkedList.add("C");

        System.out.println("Sequenced Linked List: " + sequencedLinkedList);
    }
}
