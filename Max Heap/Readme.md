# **MaxHeap — Array-Based Binary Heap in Java**

A **generic Max Heap** implementation using an **array-based binary tree structure**.
It supports insertion, extraction, traversal utilities, and parent/child access methods.
The heap ensures the **Max-Heap Property**:

> **Every parent node is greater than or equal to its children.**

---

## 📌 **Features**

### ✔ Generic Type Support

The heap accepts **any comparable type**:

```java
MaxHeap<Integer> heap = new MaxHeap<>(20);
MaxHeap<String> heap2 = new MaxHeap<>(10);
```

### ✔ Array-Based Implementation

Children and parent are calculated using index formulas:

| Relationship | Formula       |
| ------------ | ------------- |
| Left child   | `2*i + 1`     |
| Right child  | `2*i + 2`     |
| Parent       | `(i - 1) / 2` |

This gives **efficient memory layout** and allows **O(1)** access to children and parent.

---

## 🔧 **Core Operations**

### ### **1. add(T value)**

Inserts an element into the heap:

1. Append to end
2. **heapifyUp()** to fix order
3. Max-heap property restored

Time complexity: **O(log n)**

---

### **2. extractMax()**

Removes and returns the **maximum element** (at index 0):

1. Store root
2. Move last element to root
3. Reduce size
4. **heapifyDown()** to restore order

Time complexity: **O(log n)**

---

### **3. heapifyUp(int i)**

Used after insertion:

* While the new node is greater than its parent → swap upward.

---

### **4. heapifyDown(int i)**

Used after deletion:

* Compare parent with its two children
* Swap with the larger child
* Continue until correct position is found

---

## 🧪 **Test Example**

```java
public class TestMaxHeap {
    public static void main(String[] args) {
        MaxHeap<Integer> heap = new MaxHeap<>(20);

        System.out.println("Adding elements...");
        int[] nums = {50, 30, 20, 15, 10, 8, 16, 60, 55};
        for (int x : nums) heap.add(x);

        System.out.println("Heap after insertions:");
        heap.print();

        System.out.println("\nExtract max:");
        System.out.println("Max = " + heap.extractMax());
        System.out.println("Heap after extractMax:");
        heap.print();

        System.out.println("\nTesting children + parent:");
        int index = 2;
        System.out.println("Node at index " + index + " = " + nums[2]);
        System.out.println("Left child = " + heap.getLeftChild(index));
        System.out.println("Right child = " + heap.getRightChild(index));
        System.out.println("Parent = " + heap.getParent(index));

        System.out.println("\nExtracting everything:");
        while (heap.size() > 0)
            System.out.print(heap.extractMax() + " ");
        System.out.println("\nDone!");
    }
}
```

---

## 📤 **Sample Output**

```
Adding elements...
Heap after insertions:
60 55 20 50 10 8 16 15 30 

Extract max:
Max = 60
Heap after extractMax:
55 50 20 30 10 8 16 15 

Testing children + parent:
Node at index 2 = 20
Left child = 8
Right child = 16
Parent = 55

Extracting everything:
55 50 30 20 16 15 10 8 
Done!
```

---

## 🧠 **Why Use a Max-Heap?**

A max-heap is extremely useful for algorithms like:

* **Heap Sort**
* **Priority Queues**
* **Graph Algorithms** (Dijkstra, Prim)
* **Task schedulers**
* **Event simulators**

It guarantees:

* Insert → **O(log n)**
* Delete max → **O(log n)**
* Get max → **O(1)**
