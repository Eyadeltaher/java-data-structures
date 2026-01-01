# **Queue (Array-Based Implementation)**

##  Overview

This project provides an **Array-Based Queue** implementation in Java.
It uses a **circular buffer** to efficiently manage elements without shifting them in memory, ensuring **O(1)** enqueue and dequeue operations.

---

##  Features

*  Dynamic queue behavior using a fixed-size array
*  Circular index management (`myFront`, `myBack`)
*  Constant-time enqueue and dequeue
*  Clear and reset functionality
*  Contains, Peek, and String representation methods
*  Proper handling of overflow and underflow cases

---

##  Class: `MyQueue<T>`

### Key Methods

| Method                | Description                                   |
| --------------------- | --------------------------------------------- |
| `enqueue(T data)`     | Adds an element to the back of the queue      |
| `dequeue()`           | Removes and returns the front element         |
| `peek()`              | Returns the front element without removing it |
| `isEmpty()`           | Checks if the queue is empty                  |
| `isFull()`            | Checks if the queue is full                   |
| `clear()`             | Removes all elements                          |
| `contains(T element)` | Checks if an element exists in the queue      |
| `size()`              | Returns the number of elements                |
| `capacity()`          | Returns the total capacity of the queue       |
| `toString()`          | Returns a string representation of the queue  |

---

##  Example Test Output

```
=== Testing MyQueue ===

Created queue with capacity: 10

-- Enqueue elements --
Enqueued: 1 | Queue{elements=[1]}
Enqueued: 2 | Queue{elements=[1, 2]}
Enqueued: 3 | Queue{elements=[1, 2, 3]}
Enqueued: 4 | Queue{elements=[1, 2, 3, 4]}
Enqueued: 5 | Queue{elements=[1, 2, 3, 4, 5]}

Front element (peek): 1

-- Dequeue elements --
Dequeued: 1
Dequeued: 2
Queue after dequeuing two elements: Queue{elements=[3, 4, 5]}

-- Wrap-around test --
After wrap-around enqueues: Queue{elements=[3, 4, 5, 6, 7]}

Queue contains 4? true
Queue contains 10? false

Queue size: 5
Queue capacity: 10

-- Clearing queue --
Queue after clear: Queue{elements=[]}
Is empty? true

-- Testing array constructor --
Queue created from array: Queue{elements=[10, 20, 30]}
Size: 3 | Capacity: 10
```

---

##  How It Works

* `myFront` points to the **front** element (for dequeuing).
* `myBack` points to the **next available** position (for enqueuing).
* When either pointer reaches the end of the array, it **wraps around** using:

  ```java
  index = (index + 1) % elements.length;
  ```

This design avoids shifting elements and efficiently uses array space.

---

##  Example Usage

```java
MyQueue<Integer> queue = new MyQueue<>();
queue.enqueue(10);
queue.enqueue(20);
System.out.println(queue.dequeue()); // 10
System.out.println(queue.peek());    // 20
```

---

## Contributing

Contributions are welcome! If you find bugs, want to add features or improve documentation, feel free to open a pull request.

## License

This class is part of the [Java Data Structures](https://github.com/Eyadeltaher/java-data-structures) project and licensed under the [MIT License](../LICENSE).

---

*Happy coding!*

