public class LinkedQueueTest {
    public static void main(String[] args) {
        System.out.println("=== Testing LinkedQueue ===\n");

        // Create an empty queue
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        System.out.println("Created empty LinkedQueue");
        System.out.println("Is empty? " + queue.isEmpty() + "\n");

        // Enqueue elements
        System.out.println("-- Enqueue elements --");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println("Enqueued: " + i + " | Queue: " + queue);
        }

        // Peek at the front element
        System.out.println("\nFront element (peek): " + queue.peek());

        // Dequeue a couple of elements
        System.out.println("\n-- Dequeue elements --");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeuing two elements: " + queue);

        // Test contains()
        System.out.println("\nQueue contains 3? " + queue.contains(3));
        System.out.println("Queue contains 10? " + queue.contains(10));

        // Display size
        System.out.println("\nQueue size: " + queue.getSize());

        // Clear the queue
        System.out.println("\n-- Clearing queue --");
        queue.clear();
        System.out.println("Queue after clear: " + queue);
        System.out.println("Is empty? " + queue.isEmpty());

        // Test constructor with one element
        System.out.println("\n-- Constructor with one element --");
        LinkedQueue<String> single = new LinkedQueue<>("Hello");
        System.out.println("Queue: " + single);
        System.out.println("Front: " + single.peek());

        // Enqueue more into the string queue
        single.enqueue("World");
        single.enqueue("!");
        System.out.println("After more enqueues: " + single);

        // Dequeue all to test emptying behavior
        System.out.println("Dequeued: " + single.dequeue());
        System.out.println("Dequeued: " + single.dequeue());
        System.out.println("Dequeued: " + single.dequeue());
        System.out.println("Queue now: " + single);
        System.out.println("Is empty? " + single.isEmpty());
    }

}
