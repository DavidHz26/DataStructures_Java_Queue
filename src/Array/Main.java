package Array;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue(7);

        queue.traverse();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
        queue.enQueue(70);
        queue.enQueue(80);

        queue.traverse();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.traverse();

        queue.enQueue(90);

        queue.traverse();

        queue.peek();

        queue.delete();

        queue.traverse();

        queue.enQueue(1);

        queue.deQueue();

        queue.peek();

    }
}
