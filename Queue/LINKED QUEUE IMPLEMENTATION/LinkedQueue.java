public class LinkedQueue<T> {

    private Node<T> front, back;
    private int size = 0;

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedQueue() {
        front = null;
        back = null;
        size = 0;
    }

    public LinkedQueue(T data) {
        front = new Node<T>(data);
        back = front;
        size = 1;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        return front.data;
    }

    public void enqueue(T data) {
        Node<T> newptr = new Node<T>(data);
        if (isEmpty()) {
            newptr.next = null;
            back = newptr;
            front = newptr;
        } else {
            back.next = newptr;
            back = newptr;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T popped = front.data;
        front = front.next;
        size--;
        if (isEmpty()) back = null;
        return popped;
    }

    public void clear() {
        back = front = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(T data) {
        Node<T> ptr = front;
        while (ptr != null) {
            if (ptr.data == null ? data == null : ptr.data.equals(data)) {
                return true;
            }
            ptr = ptr.next;

        }
        return false;
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "[]";
        }

        String str = "[";
        Node<T> ptr = front;
        for (int i = 1; i <= size; i++) {
            str += ptr.data.toString();
            if (ptr.next != null) {
                str += ", ";
            }
            ptr = ptr.next;
        }
        return str + "]";
    }
}
