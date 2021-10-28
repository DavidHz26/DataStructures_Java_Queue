package LinkedList;

public class RawQueue {
    private LLNode<Integer> head;
    private LLNode<Integer> tail;

    public RawQueue() {
        head = null;
        tail = null;
        System.out.println("Initialized");
        traverse();
    }

    public void traverse() {

        if(isEmpty()) {
            System.out.println("Traverse failed! Queue is empty.\n");
            return;
        }

        LLNode<Integer> node = head;

        while(node != null) {
            System.out.print("[" + node.data() + "] ");

            node = node.next();
        }

        System.out.println("\n");
    }

    public void enQueue(int value) {
        LLNode<Integer> node = new LLNode<>(value);

        node.next(null);

        if(tail == null) {
            head = node;
            tail = node;
            System.out.println(value + " Enqueued!");
            traverse();
            return;
        }

        tail.next(node);
        node.previous(tail);
        tail = node;
        System.out.println(value + " Enqueued!");
        traverse();
    }

    public void peek() {
        System.out.println("Peeking...");

        if(isEmpty()) {
            System.out.println("Peek Failed! Queue is empty.");
            return;
        }

        System.out.println(head + "peeked.\n");
    }

    public void deQueue() {

        if(head == null) {
            System.out.println("Dequeued Failed! Queue is empty.");
            return;
        }

        LLNode<Integer> node = head;

        head = head.next();
        head.previous(node.previous());
        System.out.println(node + " Dequeued!");
        traverse();

    }

    public void delete() {
        head = null;
        tail = null;
        traverse();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
