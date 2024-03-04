package linearStructures.linkedList;

import java.util.NoSuchElementException;

// represents a group of nodes in sequence
// grow and shrink automatically
// [value|address] -> [value|address] -> [value|address]
public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int count = 0;
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.value == item)
                return count;
            count++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var previousNode = getPrevious(last);
            last = previousNode;
            previousNode.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var currentNode = first;
        while (currentNode != null) {
            if (currentNode.next == node)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var currentNode = first;
        int index = 0;
        while (currentNode != null) {
            array[index++] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public void reverse() {
        var currentNode = last;
        while (currentNode != first) {
            var previousNode = getPrevious(currentNode);
            currentNode.next = previousNode;
            currentNode = previousNode;
        }
        first = last;
        last = getPrevious(currentNode);
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
