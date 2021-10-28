package LinkedList;

import java.util.LinkedList;

public class Queue {

    private LinkedList<Integer> queueList;

    public Queue() {
        queueList = new LinkedList<>();
        System.out.println("Initialized");

        traverse();
    }

    public void traverse() {

        if(queueList.isEmpty()) {
            System.out.println("Queue is actually empty.\n");
            return;
        }

        for(int i : queueList) {
            System.out.print("[" + i + "] ");
        }

        System.out.println("\n");
    }

    public void enQueue(int value) {
        queueList.addLast(value);
        System.out.println(value + " Enqueued!");
        traverse();
    }

    public void deQueue() {

        if(queueList.isEmpty()) {
            System.out.println("Dequeue failed! Queue is empty.");
            return;
        }

        System.out.println(queueList.getFirst() + " Dequeued!");
        queueList.removeFirst();
        traverse();
    }

    public void peek() {
        if(queueList.isEmpty()) {
            System.out.println("Peek failed! Queue is empty.");
            return;
        }

        System.out.println(queueList.getFirst() + " Peek");
    }

}
