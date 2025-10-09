public class LinkedList<T> {

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

    public LinkedList() {
        first = null;
        size = 0;
    }

    public LinkedList(T data) {
        first = new Node<T>(data);
        size = 1;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(int index, T data) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        Node<T> newptr = new Node<T>(data);
        Node<T> prevptr = first;
        if (index == 0) {
            newptr.next = first;
            first = newptr;
        } else {
            for (int i = 0; i < index - 1; i++) {
                prevptr = prevptr.next;
            }
            newptr.next = prevptr.next;
            prevptr.next = newptr;
        }
        size++;
    }

    public void append(T data) {
        Node<T> newptr = new Node<T>(data);
        if (first == null) {
            first = newptr;
        } else {
            Node<T> prevptr = first;
            while (prevptr.next != null) {
                prevptr = prevptr.next;
            }
            prevptr.next = newptr;
            newptr.next = null;
        }
        size++;
    }

    public void set(int index, T data) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        Node<T> ptr = first;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        ptr.data = data;
    }

    public T getItem(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Invalid index " + index);

        Node<T> ptr = first;
        for (int i = 0; i < index; i++)
            ptr = ptr.next;
        return ptr.data;
    }

    public void Delete(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        if (index == 0) {
            first = first.next;
        } else {
            Node<T> prevptr = first;
            for (int i = 0; i < index - 1; i++) {
                prevptr = prevptr.next;
            }
            prevptr.next = prevptr.next.next;
        }
        size--;
    }

    public int elementIndex(T data) {
        Node<T> ptr = first;
        int i = 0;
        while (ptr != null) {
            if (ptr.data.equals(data)) {
                return i;
            }
            ptr = ptr.next;
            i++;
        }
        return -1;
    }

    public void Delete(T data) {
        if (!contains(data)) {
            System.out.println("Element doesn't exist");
        } else {
            Delete(elementIndex(data));
        }
    }

    public boolean contains(T data) {
        int i = elementIndex(data);
        return i != -1;
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
