##  LinkedList

A **custom generic Linked List** data structure implementation in Java.
Supports adding, inserting, removing, modifying, and searching elements with dynamic node linking.

---

###  Features

*  **Generic type support** (`<T>`)
*  **Node-based structure** (each element points to the next)
*  **Add** elements (at end or specific index)
*  **Delete** elements (by index or by value)
*  **Modify** elements using `set()`
*  **Search** with `elementIndex()` and `contains()`
*  **Utility methods:** `clear()`, `isEmpty()`, `getSize()`
*  **Custom `toString()`** for easy printing and debugging
*  **Exception handling** for invalid indices and operations

---

###  Usage Example

```java
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.append(10);
        list.append(20);
        list.append(30);

        System.out.println(list); // [10, 20, 30]

        list.add(1, 15); // insert at index 1
        System.out.println(list); // [10, 15, 20, 30]

        list.set(2, 99); // modify element at index 2
        System.out.println(list); // [10, 15, 99, 30]

        list.Delete(1); // delete element at index 1
        System.out.println(list); // [10, 99, 30]

        list.Delete((Integer) 99); // delete by value
        System.out.println(list); // [10, 30]

        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Index of 30: " + list.elementIndex(30)); // 1
        System.out.println("Size: " + list.getSize()); // 2

        list.clear();
        System.out.println("After clear: " + list); // []
    }
}
```

---

###  Exceptions

* `IndexOutOfBoundsException` – when index is invalid in `add()`, `set()`, `getItem()`, or `Delete()`.
* `NullPointerException` – indirectly thrown if you attempt to modify an empty list without checks.

---

###  Internal Structure

Each element is represented by a **Node**:

```java
private class Node<T> {
    T data;
    Node<T> next;
}
```

Each node stores its data and a reference to the next node — forming a chain of elements.

---

###  Utility Methods

| Method               | Description                            |
| -------------------- | -------------------------------------- |
| `add(index, data)`   | Insert element at given position       |
| `append(data)`       | Add element at the end                 |
| `Delete(index)`      | Remove element by position             |
| `Delete(data)`       | Remove first occurrence of a value     |
| `set(index, data)`   | Replace element at index               |
| `getItem(index)`     | Retrieve element at index              |
| `elementIndex(data)` | Find index of first match              |
| `contains(data)`     | Check if element exists                |
| `clear()`            | Remove all elements                    |
| `isEmpty()`          | Check if list has no elements          |
| `getSize()`          | Return current element count           |
| `toString()`         | Return formatted string representation |

---

###  License

This class is part of the [Java Data Structures](https://github.com/Eyadeltaher/java-data-structures) project and licensed under the [MIT License](../LICENSE).
