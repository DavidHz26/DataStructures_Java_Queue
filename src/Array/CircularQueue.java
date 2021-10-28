package Array;

import java.util.Arrays;

public class CircularQueue {
    private int[] listQueue;
    private int start;
    private int top;

    public CircularQueue (int size) {
        listQueue = new int[size];
        Arrays.fill(listQueue, -1);
        start = -1;
        top = -1;
    }

    public void traverse() {
        System.out.println("Traverse...");

        try {
            if(isEmpty()) {
                System.out.println("Failed! Queue is empty.");
                return;
            }

            for(int i : listQueue) {
                System.out.print("[" + i + "] ");
            }

            System.out.println("\nDone!");
        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }

    public void enQueue(int value) {
        System.out.println("Enqueue: " + value + "...");

        try{
            if(isEmpty()) {
                start = 0;
                listQueue[start] = value;
                top++;
                System.out.println("Done!");
                return;
            }

            if(isFull()) {
                System.out.println("Failed! Queue is full.");
                return;
            }

            if(top + 1 == listQueue.length) {
                top = 0;
                listQueue[top] = value;
                System.out.println("Done!");
            } else {
                top++;
                listQueue[top] = value;
                System.out.println("Done!");
            }

        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }

    public void deQueue() {
        System.out.println("Dequeue...");

        try {
            if(isEmpty()) {
                System.out.println("Failed! Queue is empty.");
                return;
            }

            System.out.println("[" + listQueue[start] + "] ");

            if(start == top) {
                top = -1;
                start = -1;
                System.out.println("Done!");
                return;
            }

            if(start + 1 == listQueue.length) {
                listQueue[start] = -1;
                start = 0;
                return;
            }

            listQueue[start] = -1;
            start++;
            System.out.println("Done!");

        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }

    public void peek() {
        System.out.println("Peek...");

        try{
            if(isEmpty()) {
                System.out.println("Failed! Queue is empty");
                return;
            }

            System.out.println("[" + listQueue[start] + "] ");
            System.out.println("Done!");

        } catch (NullPointerException e) {
            System.out.println("Error! List does not exist.");
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        if(top + 1 == start) return true;
        else if((start == 0) && (top + 1 == listQueue.length)) return true;

        return false;
    }

    public void delete() {
        listQueue = null;
        System.out.println("Done! Queue deleted.");
    }
}