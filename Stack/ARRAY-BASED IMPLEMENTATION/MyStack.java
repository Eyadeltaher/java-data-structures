public class MyStack<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyStack() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        elements = new Object[capacity];
        size = 0;
    }

    public MyStack(T arr[]) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        elements = new Object[INITIAL_CAPACITY > arr.length ? INITIAL_CAPACITY : arr.length];
        System.arraycopy(arr, 0, elements, 0, arr.length);
        size = arr.length;
    }

    public void push(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] temp = new Object[newCapacity];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }

    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T popedValue = (T) elements[--size];
        elements[size] = null;
        return popedValue;
    }

    public int capacity() {
        return elements.length;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "Stack{" + "elements=" + java.util.Arrays.toString(java.util.Arrays.copyOf(elements, size)) + "}";
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                if (element == null)
                    return true;
            } else if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}