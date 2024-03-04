package linearStructures.linkedList;

import java.util.LinkedList;

public class LinkedListsInJava {
    public void createLinkedList() {
        LinkedList linkedList = new LinkedList();
        // we can add any type of values to the node
        linkedList.addLast(10);
        linkedList.addFirst("Hello");

        // if we want only specific types, we can also define those
        LinkedList<Integer> iLinkedList = new LinkedList<>();
        iLinkedList.add(5);
    }

}
