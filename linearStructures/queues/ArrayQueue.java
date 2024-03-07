package linearStructures.queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    int first = 0;
    int last = 0;
    private int count = 0;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[last] = item;
        last = (last + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[first];
        items[first] = 0;
        first = (first + 1) % items.length;
        first--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
