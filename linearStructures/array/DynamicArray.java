package linearStructures.array;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int existingNumberOfItems = 0;

    public DynamicArray(int length) {
        array = new int[length];
    }

    public void insert(int number) {
        if (existingNumberOfItems + 1 >= array.length) {
            array[existingNumberOfItems + 1] = number;
            existingNumberOfItems += 1;
        } else {
            int[] copy = new int[2 * array.length];
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            array = copy;
            array[existingNumberOfItems + 1] = number;
            existingNumberOfItems++;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= existingNumberOfItems) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < existingNumberOfItems; i++)
            array[i] = array[i + 1];
        existingNumberOfItems--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < existingNumberOfItems; i++) {
            if (array[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }
}
