public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("=== Testing LinkedList ===");

        // Test isEmpty
        System.out.println("Is empty? " + list.isEmpty());

        // Append elements
        list.append(10);
        list.append(20);
        list.append(30);
        System.out.println("After appending 10, 20, 30: " + list);

        // Add elements at specific positions
        list.add(0, 5);   // add at head
        list.add(2, 15);  // add in middle
        list.add(list.getSize(), 40); // add at tail
        System.out.println("After adding 5, 15, and 40: " + list);

        // Get elements
        System.out.println("Item at index 0: " + list.getItem(0));
        System.out.println("Item at index 3: " + list.getItem(3));
        System.out.println("Item at last index: " + list.getItem(list.getSize() - 1));

        // Set element
        list.set(2, 99);
        System.out.println("After setting index 2 to 99: " + list);

        // Delete by index
        list.Delete(0);
        System.out.println("After deleting index 0: " + list);

        list.Delete(list.getSize() - 1);
        System.out.println("After deleting last element: " + list);

        // Delete by value
        list.Delete((Integer) 99);
        System.out.println("After deleting value 99: " + list);

        // Contains check
        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Contains 100? " + list.contains(100));

        // Element index
        System.out.println("Index of 20: " + list.elementIndex(20));

        // Size check
        System.out.println("Current size: " + list.getSize());

        // Clear all
        list.clear();
        System.out.println("After clearing: " + list);
        System.out.println("Is empty? " + list.isEmpty());
    }
}
