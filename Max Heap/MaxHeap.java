
public class MaxHeap<T extends Comparable<T>> {
    private final T heap[];
    private int size;

    @SuppressWarnings("unchecked")
    public MaxHeap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    public int left(int i) {
        return (2 * i) + 1;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int right(int i) {
        return (2 * i) + 2;
    }

    public void add(T value) {
        if (size >= heap.length) {
            throw new RuntimeException("Heap full");
        }
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    private void heapifyUp(int i) {
        while (i > 0 && heap[i].compareTo(heap[parent(i)]) > 0) {
            T temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i); // move upward
        }
    }

    public T extractMax() { // Return and remove the maximum element from the max-heap
        if (size == 0)
            throw new RuntimeException("Heap empty");

        T max = heap[0];
        heap[0] = heap[size - 1]; // move last to root
        size--;
        heap[size] = null;

        heapifyDown(0);
        return max;
    }

    private void heapifyDown(int i) {
        while (true) {
            int left = left(i);
            int right = right(i);
            int largest = i;

            if (left < size && heap[left].compareTo(heap[largest]) > 0)
                largest = left;

            if (right < size && heap[right].compareTo(heap[largest]) > 0)
                largest = right;

            if (largest == i)
                break;

            T temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            i = largest; // go down
        }
    }

    public T getLeftChild(int i) {
        int index = left(i);
        if (index >= size)
            return null;
        return heap[index];
    }

    public T getRightChild(int i) {
        int index = right(i);
        if (index >= size)
            return null;
        return heap[index];
    }

    public T getParent(int index) {
        int i = parent(index);
        if (index == 0)
            return null;
        return heap[i];
    }

    public T getNode(int index) {
        if (index == size)
            return null;
        return heap[index];
    }

    public int size() {
        return size;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}
