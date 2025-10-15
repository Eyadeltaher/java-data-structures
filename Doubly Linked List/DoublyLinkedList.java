public class DoublyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> previous;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public DoublyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public DoublyLinkedList(T data) {
        first = new Node<T>(data);
        last = first;
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
        if (index == 0) {
            if (isEmpty()) {
                first = last = newptr;
                first.next = first.previous = first;
            } else {
                newptr.previous = last;
                newptr.next = first;
                last.next = newptr;
                first.previous = newptr;
                first = newptr;
            }
        } else if (index == size) {
            append(data);
            return;
        } else {
            Node<T> prevptr = first;
            for (int i = 0; i < index - 1; i++) {
                prevptr = prevptr.next;
            }
            newptr.next = prevptr.next;
            newptr.previous = prevptr;
            prevptr.next.previous = newptr;
            prevptr.next = newptr;
        }
        size++;
    }

    public void append(T data) {
        Node<T> newptr = new Node<T>(data);
        if (isEmpty()) {
            first = last = newptr;
            first.next = first.previous = first;
        } else {
            last.next = newptr;
            newptr.previous = last;
            newptr.next = first;
            first.previous = newptr;
            last = newptr;
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
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return ptr.data;
    }

    public void delete(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        if (size == 1) {
            first = null;
            last = null;
        } else if (index == size - 1) {
            last = last.previous;
            last.next = first;
            first.previous = last;
        } else if (index == 0) {
            first = first.next;
            first.previous = last;
            last.next = first;
        } else {
            Node<T> prevptr = first;
            for (int i = 0; i < index - 1; i++) {
                prevptr = prevptr.next;
            }

            prevptr.next.next.previous = prevptr;
            prevptr.next = prevptr.next.next;
        }
        size--;
    }

    public void delete(T data) {
        if (!contains(data)) {
            System.out.println("Element doesn't exist");
        } else {
            delete(elementIndex(data));
        }
    }

    public int elementIndex(T data) {
        Node<T> ptr = first;
        for (int i = 0; i < size; i++) {
            if (ptr.data.equals(data)) {
                return i;
            }
            ptr = ptr.next;
        }
        return -1;
    }

    public boolean contains(T data) {
        return elementIndex(data) != -1;
    }

    public void clear() {
        first = null;
        last = null;
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
        for (int i = 0; i < size; i++) {
            str += ptr.data.toString();
            if (ptr.next != first) {
                str += ", ";
            }
            ptr = ptr.next;
        }
        return str + "]";
    }
}
