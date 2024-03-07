package linearStructures.stacks;

import java.util.Arrays;

public class StackUsingArray {
    private int[] stack = new int[5];
    private int count = 0;

    public void push(int number) {
        if (stack.length == count)
            throw new StackOverflowError();

        stack[count++] = number;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();

        return stack[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalArgumentException();
        return stack[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack, 0, count));
    }
}
