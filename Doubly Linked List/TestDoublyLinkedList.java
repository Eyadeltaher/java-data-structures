public class TestDoublyLinkedList {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.println("=== TESTING APPEND ===");
        list.append(10);
        list.append(20);
        list.append(30);
        System.out.println("List after appending 10, 20, 30: " + list);
        System.out.println("Size: " + list.getSize());

        System.out.println("\n=== TESTING ADD (insert at index) ===");
        list.add(0, 5);   // insert at beginning
        list.add(2, 15);  // insert in middle
        list.add(list.getSize(), 40); // insert at end
        System.out.println("List after adding at various positions: " + list);
        System.out.println("Size: " + list.getSize());

        System.out.println("\n=== TESTING GET ITEM ===");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Element at index " + i + ": " + list.getItem(i));
        }

        System.out.println("\n=== TESTING SET ===");
        list.set(2, 99);
        System.out.println("List after setting index 2 to 99: " + list);

        System.out.println("\n=== TESTING DELETE BY INDEX ===");
        list.delete(0);  // delete first
        list.delete(list.getSize() - 1); // delete last
        list.delete(1);  // delete middle
        System.out.println("List after deletions: " + list);
        System.out.println("Size: " + list.getSize());

        System.out.println("\n=== TESTING DELETE BY VALUE ===");
        list.delete(Integer.valueOf(99));
        System.out.println("List after deleting value 99: " + list);
        System.out.println("Contains 99? " + list.contains(99));
        System.out.println("Contains 20? " + list.contains(20));

        System.out.println("\n=== TESTING CLEAR ===");
        list.clear();
        System.out.println("List after clear(): " + list);
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("Size: " + list.getSize());

        System.out.println("\n=== TESTING SINGLE ELEMENT BEHAVIOR ===");
        list.append(111);
        System.out.println("List: " + list);
        list.delete(0);
        System.out.println("List after deleting single element: " + list);
        System.out.println("Is empty? " + list.isEmpty());
    }
}
