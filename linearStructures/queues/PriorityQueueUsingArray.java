package linearStructures.queues;

import java.util.Arrays;

public class PriorityQueueUsingArray {
    private int[] items;
    private int count;

    public PriorityQueueUsingArray(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();

        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public boolean isFull() {
        return count == items.length;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else {

                break;
            }
        }
        return i + 1;
    }

    // return the highest number
    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    private boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
