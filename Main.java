import linearStructures.queues.PriorityQueueUsingArray;

public class Main {
    public static void main(String[] args) {
        PriorityQueueUsingArray priorityQueueUsingArray = new PriorityQueueUsingArray(10);
        priorityQueueUsingArray.add(10);
        priorityQueueUsingArray.add(1);
        priorityQueueUsingArray.add(12);
        System.out.println(priorityQueueUsingArray);
    }
}