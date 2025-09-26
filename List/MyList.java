
public class MyList<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        elements = new Object[capacity];
        size = 0;
    }

    public MyList(T arr[]) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        elements = new Object[INITIAL_CAPACITY > arr.length ? INITIAL_CAPACITY : arr.length];
        System.arraycopy(arr, 0, elements, 0, arr.length);
        size = arr.length;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public void set(T element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == elements.length) {
            resize();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] temp = new Object[newCapacity];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }
    
@SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public void pop() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        elements[--size] = null;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return elements.length;
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
        return "List{" + "elements=" + java.util.Arrays.toString(java.util.Arrays.copyOf(elements, size)) + "}";
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                if (element == null)
                    return i;
            } else if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1; // Not found
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public void modify(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elements[index] = element;
    }
}