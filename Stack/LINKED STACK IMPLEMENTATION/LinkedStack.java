public class LinkedStack<T> {

    private Node<T> first;
    private int size = 0;

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedStack() {
        first = null;
        size = 0;
    }

    public LinkedStack(T data) {
        first = new Node<T>(data);
        size = 1;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T data) {
        Node<T> newptr = new Node<T>(data);
        if (first == null) {
            first = newptr;
        } else {
            newptr.next = first;
            first = newptr;
        }
        size++;
    }

    public T peek() {
        if (size == 0)
            throw new IllegalStateException("Stack is empty");

        return first.data;
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T popped = first.data;
        first = first.next;
        size--;
        return popped;
    }

    public boolean contains(T data) {
        Node<T> ptr = first;
        while (ptr != null) {
            if (ptr.data == null ? data == null : ptr.data.equals(data)) {
                return true;
            }
            ptr = ptr.next;

        }
        return false;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        if (first == null) {
            return "[]";
        }

        String str = "[";
        Node<T> ptr = first;
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
