## 📘 Doubly Linked List (Circular)

A **generic circular doubly linked list** in Java.
Each node holds a data value and references to both the **next** and **previous** nodes, forming a continuous circular structure where:

* The `next` reference of the last node points to the first node.
* The `previous` reference of the first node points to the last node.

This makes the list efficient for **bi-directional traversal** and operations on both ends.

---

### ⚙️ Features

✅ Add elements at any position
✅ Append elements to the end
✅ Delete elements by index or value
✅ Retrieve or update elements
✅ Check for existence of a value
✅ Clear the list
✅ Circular linking maintained automatically
✅ Generic — works with any data type

---

### 🧱 Class Structure

#### `DoublyLinkedList<T>`

| Method                   | Description                                          |
| ------------------------ | ---------------------------------------------------- |
| `isEmpty()`              | Checks if the list is empty                          |
| `add(int index, T data)` | Inserts a new element at a specific index            |
| `append(T data)`         | Adds an element at the end of the list               |
| `set(int index, T data)` | Updates the value at a given index                   |
| `getItem(int index)`     | Returns the element at a given index                 |
| `delete(int index)`      | Deletes the element at the specified index           |
| `delete(T data)`         | Deletes the first occurrence of a value              |
| `elementIndex(T data)`   | Returns the index of the first occurrence of a value |
| `contains(T data)`       | Checks whether the list contains a specific value    |
| `clear()`                | Removes all elements                                 |
| `getSize()`              | Returns the current number of elements               |
| `toString()`             | Returns a string representation of the list          |

---

### 🧪 Example Usage

#### `TestDoublyLinkedList.java`

```java
public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(10);
        list.append(20);
        list.append(30);
        System.out.println("List: " + list); // [10, 20, 30]

        list.add(1, 15);
        System.out.println("After adding 15 at index 1: " + list); // [10, 15, 20, 30]

        list.delete(2);
        System.out.println("After deleting index 2: " + list); // [10, 15, 30]

        System.out.println("Element at index 1: " + list.getItem(1)); // 15

        list.set(1, 99);
        System.out.println("After setting index 1 to 99: " + list); // [10, 99, 30]

        System.out.println("Contains 99? " + list.contains(99)); // true
        System.out.println("Size: " + list.getSize()); // 3
    }
}
```

---

### 💡 Circular Behavior

The list is **circular**, meaning:

* `last.next == first`
* `first.previous == last`

So traversing forward or backward will never hit `null`.

---


### 🧠 Time Complexity

| Operation                  | Average Case | Worst Case |
| -------------------------- | ------------ | ---------- |
| Append                     | O(1)         | O(1)       |
| Add (at index)             | O(n)         | O(n)       |
| Delete (by index or value) | O(n)         | O(n)       |
| Search / Contains          | O(n)         | O(n)       |
| Clear                      | O(1)         | O(1)       |

---

### 🏗️ Future Enhancements

* Add **reverse traversal printing**
* Optimize traversal direction (forward vs backward) for mid-list operations

---

### 📜 License

This class is part of the [Java Data Structures](https://github.com/Eyadeltaher/java-data-structures) project and licensed under the [MIT License](../LICENSE).
