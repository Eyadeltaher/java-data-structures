# Array-Based Stack Implementation in Java

This repository contains a generic, array-based implementation of a stack data structure in Java.  
It is part of the “Java Data Structures” collection.

## Overview

A *stack* is a Last-In-First-Out (LIFO) collection: the last element pushed is the first one popped.  
This implementation uses an internal `Object[]` array, supports dynamic resizing when full, and provides typical stack operations:

- `push(T element)` — add an element to the top of the stack  
- `peek()` — view the top element without removing it  
- `pop()` — remove and return the top element  
- `isEmpty()` — check whether the stack is empty  
- `size()` — number of elements in the stack  
- `clear()` — remove all elements  
- `contains(T element)` — check whether the stack contains the given element  

## Features

- Generic: works with any object type `T`.  
- Dynamic growth: when the internal array is full, the capacity doubles automatically.  
- Safe memory handling: removed elements are nulled to help garbage collection.  
- Constructors provide flexibility:
  - Default constructor (`initialCapacity = 10`)  
  - Constructor with custom capacity  
  - Constructor from existing array  

## Usage

```java
MyStack<Integer> stack = new MyStack<>();
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek());  // prints 30

stack.pop();
System.out.println(stack);         // prints [10, 20]

System.out.println("Contains 20? " + stack.contains(20));  // true
stack.clear();
System.out.println("Is empty? " + stack.isEmpty());        // true
````

## Constructors

| Constructor             | Description                                                                                                            |
| ----------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `MyStack()`             | Creates a stack with default initial capacity (10).                                                                    |
| `MyStack(int capacity)` | Creates a stack with specified initial capacity; if `capacity <= 0`, throws `IllegalArgumentException`.                |
| `MyStack(T[] arr)`      | Initializes the stack from an existing array; copies all elements, uses capacity = `max(defaultCapacity, arr.length)`. |

## Exceptions

* `peek()` and `pop()` throw `IllegalStateException` when the stack is empty.
* The constructor with capacity throws `IllegalArgumentException` if the capacity is non-positive.

## Performance

* `push(...)` is **amortized O(1)** thanks to dynamic resizing.
* `pop()`, `peek()`, `isEmpty()`, `size()`, `clear()` are O(1).
* `contains(...)` is O(n) in the worst case (scans all elements).
* Memory footprint grows as the internal array doubles its size when needed.

## Example Test

A simple test in `TestMyStack.java` demonstrates the use and behavior of this stack implementation, including exceptions:

```java
MyStack<Integer> stack = new MyStack<>();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println(stack);            // [10, 20, 30]
System.out.println(stack.peek());    // 30
System.out.println(stack.contains(100));  // false
stack.pop();
System.out.println(stack);            // [10, 20]
stack.clear();
System.out.println(stack.isEmpty()); // true
```

## Contributing

Contributions are welcome! If you find bugs, want to add features (e.g., iterators, capacity shrink-back, thread‐safety) or improve documentation, feel free to open a pull request.

## License

This class is part of the [Java Data Structures](https://github.com/Eyadeltaher/java-data-structures) project and licensed under the [MIT License](../LICENSE).

---

*Happy coding!*
