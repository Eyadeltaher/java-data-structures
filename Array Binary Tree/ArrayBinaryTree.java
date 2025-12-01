
public class ArrayBinaryTree<T> {
    private T tree[];
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayBinaryTree(int capacity) {
        tree = (T[]) new Object[capacity];
        size = 0;
    }

    public void insert(T value) {
        if (size == tree.length)
            throw new IllegalStateException("Tree is full!");

        tree[size] = value;
        size++;
    }

    public int leftChildIndex(int i) {
        return (2 * i) + 1;
    }

    public int rightChildIndex(int i) {
        return (2 * i) + 2;
    }

    public T getLeftChild(int i) {
        int index = leftChildIndex(i);
        if (index >= size)
            return null;
        return tree[index];
    }

    public T getRightChild(int i) {
        int index = rightChildIndex(i);
        if (index >= size)
            return null;
        return tree[index];
    }

    public T getParent(int index) {
        if (index == 0)
            return null;
        return tree[(index - 1) / 2];
    }

    public int size() {
        return size;
    }

    public void preOrder(int index) { // ROOT → LEFT → RIGHT
        if (index >= size) {
            return;
        }
        System.out.print(tree[index] + " ");
        preOrder(leftChildIndex(index));
        preOrder(rightChildIndex(index));
    }

    public void inOrder(int index) { // LEFT → ROOT → RIGHT
        if (index >= size) {
            return;
        }
        preOrder(leftChildIndex(index));
        System.out.print(tree[index] + " ");
        preOrder(rightChildIndex(index));
    }

    public void postOrder(int index) { // LEFT → RIGHT → ROOT
        if (index >= size)
            return;

        postOrder(leftChildIndex(index));
        postOrder(rightChildIndex(index));
        System.out.print(tree[index] + " ");
    }

}
