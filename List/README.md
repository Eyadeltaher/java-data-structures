# MyList<T>

A custom generic **List data-structure implementation** in Java.  
Supports adding, inserting, removing, modifying, and searching elements with automatic resizing.

---

##  Features
- Generic type support (`<T>`)
- Dynamic resizing when capacity is exceeded
- Add elements (at end or at specific index)
- Remove elements by index or last element (`pop`)
- Modify existing elements
- Search with `indexOf()` and `contains()`
- Utility methods: `clear()`, `isEmpty()`, `size()`, `capacity()`
- Exception handling for invalid operations

---

##  Usage Example

```java
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // List{elements=[10, 20, 30]}

        list.set(15, 1); // insert at index 1
        System.out.println(list); // List{elements=[10, 15, 20, 30]}

        list.modify(2, 99); // replace element at index 2
        System.out.println(list); // List{elements=[10, 15, 99, 30]}

        list.remove(1);
        System.out.println(list); // List{elements=[10, 99, 30]}

        list.pop();
        System.out.println(list); // List{elements=[10, 99]}
    }
}
````

---

##  Exceptions

* `IllegalArgumentException` – if capacity ≤ 0 or array is `null` in constructor.
* `IndexOutOfBoundsException` – for invalid index in `get`, `set`, `remove`, or `modify`.
* `IllegalStateException` – when calling `pop()` on an empty list.

---

##  License

This class is part of the [Java Data Structures](https://github.com/Eyadeltaher/java-data-structures) project and licensed under the [MIT License](../LICENSE).


