import java.util.Arrays;

import linearStructures.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);

        linkedList.reverse();

        System.out.println(Arrays.toString(linkedList.toArray()));
    }
}