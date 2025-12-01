public class TestMaxHeap {
    public static void main(String[] args) {

        MaxHeap<Integer> heap = new MaxHeap<>(20);

        System.out.println("Adding elements...");
        heap.add(50);
        heap.add(30);
        heap.add(20);
        heap.add(15);
        heap.add(10);
        heap.add(8);
        heap.add(16);
        heap.add(60);
        heap.add(55);

        System.out.println("Heap after insertions:");
        heap.print();

        System.out.println("\nExtract max:");
        System.out.println("Max = " + heap.extractMax());

        System.out.println("Heap after extractMax:");
        heap.print();

        System.out.println("\nTesting children + parent:");
        int index = 2;
        System.out.println("Node at index " + index + " = " + heap.getNode(index));
        System.out.println("Left child = " + heap.getLeftChild(index));
        System.out.println("Right child = " + heap.getRightChild(index));
        System.out.println("Parent = " + heap.getParent(index));

        // Extract all elements
        System.out.println("\nExtracting everything:");
        while (heap.size() > 0) {
            System.out.print(heap.extractMax() + " ");
        }
        System.out.println("\nDone!");
    }
}
