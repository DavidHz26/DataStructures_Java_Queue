package LinkedList;

public class LLNode<T> {

    private T data;
    private LLNode<T> next;
    private LLNode<T> previous;

    public LLNode(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void previous(LLNode<T> node) {
        this.previous = node;
    }

    public void next(LLNode<T> node) {
        this.next = node;
    }

    public LLNode<T> next() {
        return next;
    }

    public LLNode<T> previous() {
        return previous;
    }

    public T data() {
        return data;
    }

    @Override
    public String toString() {
        return "[" + data + "] ";
    }




}
