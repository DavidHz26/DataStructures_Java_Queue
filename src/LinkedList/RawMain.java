package LinkedList;

public class RawMain {

    public static void main(String[] args) {

        RawQueue listQueue = new RawQueue();

        listQueue.enQueue(10);
        listQueue.enQueue(20);
        listQueue.enQueue(30);
        listQueue.enQueue(40);
        listQueue.enQueue(50);

        listQueue.peek();

        listQueue.deQueue();
        listQueue.deQueue();
        listQueue.deQueue();

        listQueue.peek();

        listQueue.enQueue(60);
        listQueue.enQueue(70);
        listQueue.enQueue(80);

        listQueue.deQueue();

        listQueue.peek();

        listQueue.delete();

    }
}
