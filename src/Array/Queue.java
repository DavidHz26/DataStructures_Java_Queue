package Array;

import java.util.Arrays;

public class Queue {

    public int[] listQueue;
    public int beginning;
    private int top;

    public Queue(int size) {
        System.out.println("Creating queue...");
        listQueue = new int[size];

        Arrays.fill(listQueue, -1);
        beginning = -1;
        top = -1;
        System.out.println("Done!");
    }

    public void traverse() {
        System.out.println("Traversing...");

        try {
            if (isEmpty()) {
                System.out.println("Failed! Queue is empty.");
                return;
            }

            for (int i = beginning; i <= top; i++) {
                System.out.print("[" + listQueue[i] + "] ");
            }

            System.out.println("\nDone!");

        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }

    public void enQueue(int value) {
        System.out.println("EnQueue: " + value + "...");

        try {
            if (isFull()) {
                System.out.println("Failed! Queue is full.");
                return;
            }

            if(isEmpty()) {
                beginning = 0;
                top++;
                listQueue[top] = value;
                System.out.println("Done!");
                return;
            }

            listQueue[++top] = value;
            System.out.println("Done!");

        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }

    public void deQueue(){
        System.out.println("Dequeue...");

        try {

            if (isEmpty()) {
                System.out.println("Failed! List is empty.");
                return;
            }

            System.out.println(listQueue[beginning]);
            beginning++;

            if (beginning > top) {
                beginning = -1;
                top = -1;
                return;
            }
        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }


    public void peek() {
        System.out.print("Peek: ");

        try {
            if (isEmpty()) {
                System.out.println("Failed! Queue is empty.");
                return;
            }

            System.out.println("[" + listQueue[beginning] + "] ");
        } catch (NullPointerException e) {
            System.out.println("Error! Queue does not exist.");
        }
    }

    public boolean isFull() {
        return top == listQueue.length - 1;
    }


    public boolean isEmpty(){
        return beginning == -1;
    }

    public void delete() {
        if(listQueue == null) {
            System.out.println("Failed! Queue is empty.");
            return;
        }

        listQueue = null;
        System.out.println("Queue Deleted!");
    }

}
