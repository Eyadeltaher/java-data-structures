public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        System.out.println("=== Testing push() ===");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        System.out.println("\n=== Testing peek() ===");
        System.out.println("Element at last index: " + stack.peek());

        System.out.println("\n=== Testing contains() ===");
        System.out.println("Contains 30? " + stack.contains(30));
        System.out.println("Contains 100? " + stack.contains(100));

        System.out.println("\n=== Testing pop() ===");
        stack.pop();
        System.out.println(stack);

        System.out.println("\n=== Testing clear() ===");
        stack.clear();
        System.out.println("After clear: " + stack);

        System.out.println("\n=== Testing isEmpty() ===");
        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("\n=== Testing constructor with array ===");
        Integer[] arr = { 1, 2, 3, 4 };
        MyStack<Integer> stackFromArr = new MyStack<>(arr);
        System.out.println(stackFromArr);

        System.out.println("\n=== Testing exceptions ===");
        try {
            stack.peek();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e);
        }

        try {
            MyStack<Integer> bad = new MyStack<>(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e);
        }

        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}
