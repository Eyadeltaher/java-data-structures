public class MyQueueTest {
    public static void main(String[] args) {
        System.out.println("=== Testing MyQueue ===\n");

        // Test 1: Default constructor
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println("Created queue with capacity: " + queue.capacity());

        // Test 2: Enqueue elements
        System.out.println("\n-- Enqueue elements --");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println("Enqueued: " + i + " | " + queue);
        }

        // Test 3: Peek front
        System.out.println("\nFront element (peek): " + queue.peek());

        // Test 4: Dequeue two elements
        System.out.println("\n-- Dequeue elements --");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeuing two elements: " + queue);

        // Test 5: Wrap-around behavior
        System.out.println("\n-- Wrap-around test --");
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("After wrap-around enqueues: " + queue);

        // Test 6: Contains check
        System.out.println("\nQueue contains 4? " + queue.contains(4));
        System.out.println("Queue contains 10? " + queue.contains(10));

        // Test 7: Size and capacity
        System.out.println("\nQueue size: " + queue.size());
        System.out.println("Queue capacity: " + queue.capacity());

        // Test 8: Clear queue
        System.out.println("\n-- Clearing queue --");
        queue.clear();
        System.out.println("Queue after clear: " + queue);
        System.out.println("Is empty? " + queue.isEmpty());

        // Test 9: Custom constructor with array
        System.out.println("\n-- Testing array constructor --");
        Integer[] arr = { 10, 20, 30 };
        MyQueue<Integer> queue2 = new MyQueue<>(arr);
        System.out.println("Queue created from array: " + queue2);
        System.out.println("Size: " + queue2.size() + " | Capacity: " + queue2.capacity());
    }

}
