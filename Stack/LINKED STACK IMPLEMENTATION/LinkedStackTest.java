public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        System.out.println("=== Testing LinkedStack ===");

        // Test isEmpty
        System.out.println("Is empty? " + stack.isEmpty());

        // push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushing 10, 20, 30: " + stack);


        // peek elements
        System.out.println("Item peeked: " + stack.peek());

        // Test getSize
        System.out.println("Stack size: " + stack.getSize());

        // pop
        stack.pop();
        System.out.println("After poping: " + stack);

        // Contains check
        System.out.println("Contains 20? " + stack.contains(20));
        System.out.println("Contains 100? " + stack.contains(100));

        // Size check
        System.out.println("Current size: " + stack.getSize());

        // Clear all
        stack.clear();
        System.out.println("After clearing: " + stack);
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
