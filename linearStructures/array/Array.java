package linearStructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Array {
    // lookup O(1)

    // static -> specify the size
    // if we don't know the size we have to make a guess
    // if the guess is small, array will quickly
    // if guess is large, memory is wasted
    // if not enough size, we have to copy the items in the array to another array
    // with more size O(n)

    // deletion
    // best case scenario -> remove the last item O(1)
    // worst case scenario -> remove the first item O(n) -> after removing shift all
    // to begin

    public void createArray() {
        // declare array
        int[] numbers = new int[3];
        // initialize
        numbers[0] = 5; // ... and add others positions

        // declare and initialize
        int[] newNumbers = { 1, 2, 3 };

        System.out.println(newNumbers.length);
        System.out.println(Arrays.toString(numbers));
    }

    // java has two methods to make a dynamic array
    // Vector -> grows by 100% when size is not enough
    // ArrayList -> grows by 50% when size is not enough

    public void arrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.indexOf(10);
        list.contains(10);
        list.remove(0);
        list.toArray(); // converts to a regular array
    }

    public void vector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
    }
}
