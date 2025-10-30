public class MyQueue<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;
    private int myBack;
    private int myFront;

    public MyQueue() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
        myBack = 0;
        myFront = 0;
    }

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        elements = new Object[capacity];
        size = 0;
        myBack = 0;
        myFront = 0;
    }

    public MyQueue(int capacity, T data) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        elements = new Object[capacity];
        elements[0] = data;
        size = 1;
        myBack = 1;
        myFront = 0;
    }

    public MyQueue(T data) {
        elements = new Object[INITIAL_CAPACITY];
        elements[0] = data;
        size = 1;
        myBack = 1;
        myFront = 0;
    }

    public MyQueue(T arr[]) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        elements = new Object[INITIAL_CAPACITY > arr.length ? INITIAL_CAPACITY : arr.length];
        System.arraycopy(arr, 0, elements, 0, arr.length);
        size = arr.length;
        myBack = size;
        myFront = 0;
    }

    public void enqueue(T data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        }

        elements[myBack] = data;
        myBack = (myBack + 1) % elements.length;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T dequeueData = (T) elements[myFront];
        elements[myFront] = null;
        myFront = (myFront + 1) % elements.length;
        size--;
        return dequeueData;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[myFront];
    }

    public int capacity() {
        return elements.length;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(myFront + i) % elements.length] = null;
        }
        size = 0;
        myBack = myFront = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            int index = (myFront + i) % elements.length;
            if (elements[index] == null ? element == null : elements[index].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue{elements=[");
        for (int i = 0; i < size; i++) {
            int index = (myFront + i) % elements.length;
            sb.append(elements[index]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }

}