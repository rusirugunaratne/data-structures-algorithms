package linearStructures.queues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueInJava {
    // in Java Queue is an interface. So we cannot create objects.
    // Queue<Integer> queue = new Queue<>(); This is wrong
    // go to documentation for more info
    // https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html

    Queue<Integer> queue = new ArrayDeque<>();

    public void queueOperations() {
        queue.add(10);
        queue.add(20);
        var front = queue.remove();
    }

    public void reverse() {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

    public void priorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(2);
        // in java by default in PQ, the priority is given to the smallest number
        // even when we add a new item, it adds to the appropriate position so it is
        // always sorted
    }
}
