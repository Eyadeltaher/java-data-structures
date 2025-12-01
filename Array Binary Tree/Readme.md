# **Array-Based Binary Tree in Java**

A **generic array-based binary tree** in Java.
It supports insertion and standard tree traversals: **pre-order, in-order, and post-order**.
The tree is **not a heap** or a binary search tree — it is a **simple complete binary tree stored in an array**.

---

## 📌 **Features**

* Generic type support (`T`)
* Array-based storage for nodes
* Insert elements sequentially (complete binary tree order)
* Get left/right child or parent of any node
* Pre-order, In-order, and Post-order traversals

---

## 🔧 **Core Methods**

### **1. insert(T value)**

Adds a new element to the tree.

* Appends to the next available index
* Throws `IllegalStateException` if tree is full

**Time complexity:** O(1)

---

### **2. leftChildIndex(int i) / rightChildIndex(int i)**

Calculates the index of a node's left or right child in the array:

| Relation    | Formula   |
| ----------- | --------- |
| Left child  | 2 * i + 1 |
| Right child | 2 * i + 2 |

---

### **3. getLeftChild(int i) / getRightChild(int i)**

Returns the child element at the calculated index or `null` if it does not exist.

---

### **4. getParent(int index)**

Returns the parent of a given node, or `null` if the node is the root.

Formula: `(index - 1) / 2`

---

### **5. Tree Traversals**

* **Pre-order (ROOT → LEFT → RIGHT)**
* **In-order (LEFT → ROOT → RIGHT)**
* **Post-order (LEFT → RIGHT → ROOT)**

**Time complexity for all traversals:** O(n)

---

## 🧪 **Example Usage**

```java
public class TestArrayBinaryTree {
    public static void main(String[] args) {
        ArrayBinaryTree<Integer> tree = new ArrayBinaryTree<>(15);

        int[] elements = {10, 20, 30, 40, 50, 60, 70};
        for (int el : elements) {
            tree.insert(el);
        }

        System.out.println("Pre-order traversal:");
        tree.preOrder(0);  // Output: 10 20 40 50 30 60 70
        System.out.println();

        System.out.println("In-order traversal:");
        tree.inOrder(0);   // Output: 40 20 50 10 60 30 70
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrder(0); // Output: 40 50 20 60 70 30 10
        System.out.println();
    }
}
```

---

## 📌 **Sample Output**

```
Pre-order traversal:
10 20 40 50 30 60 70 

In-order traversal:
40 20 50 10 60 30 70 

Post-order traversal:
40 50 20 60 70 30 10
```

---

## 📌 **Tree Indexing Example**

Array representation of the tree:

```
Index: 0   1   2   3   4   5   6
Value:10  20  30  40  50  60  70
```

Tree structure:

```
        10
       /  \
     20    30
    / \    / \
  40  50  60  70
```

* Root → index 0
* Left child of 20 → index 3 (value 40)
* Right child of 30 → index 6 (value 70)

---

## ⚡ **Notes**

* This implementation is **not a binary search tree** — no ordering between nodes is enforced.
* Suitable for **complete binary tree representation**.
* Traversals are recursive, but could be implemented iteratively using a stack if needed.



