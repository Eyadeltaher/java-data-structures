public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        System.out.println("=== Testing add() ===");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // [10, 20, 30]

        System.out.println("\n=== Testing add(index, element) ===");
        list.set(15, 1);  
        System.out.println(list); // [10, 15, 20, 30]

        System.out.println("\n=== Testing get() ===");
        System.out.println("Element at index 2: " + list.get(2)); // 20

        System.out.println("\n=== Testing modify() ===");
        list.modify(2, 99);
        System.out.println(list); // [10, 15, 99, 30]

        System.out.println("\n=== Testing indexOf() and contains() ===");
        System.out.println("Index of 99: " + list.indexOf(99)); // should be 2
        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Contains 100? " + list.contains(100)); // false

        System.out.println("\n=== Testing remove() ===");
        list.remove(1); // remove element at index 1
        System.out.println(list); // [10, 99, 30]

        System.out.println("\n=== Testing pop() ===");
        list.pop();
        System.out.println(list); // [10, 99]

        System.out.println("\n=== Testing clear() ===");
        list.clear();
        System.out.println("After clear: " + list); // []

        System.out.println("\n=== Testing isEmpty() ===");
        System.out.println("Is empty? " + list.isEmpty()); // true

        System.out.println("\n=== Testing constructor with array ===");
        Integer[] arr = {1, 2, 3, 4};
        MyList<Integer> listFromArr = new MyList<>(arr);
        System.out.println(listFromArr); // [1, 2, 3, 4]

        System.out.println("\n=== Testing exceptions ===");
        try {
            list.get(0); // should throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e);
        }

        try {
            MyList<Integer> bad = new MyList<>(0); // should throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e);
        }

        try {
            list.pop(); // should throw IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}

