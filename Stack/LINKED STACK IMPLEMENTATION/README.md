# Linked­List-Based Stack Implementation in Java

This directory contains a generic, linked-list-based implementation of a stack data structure in Java.  

## Overview

A *stack* is a Last-In-First-Out (LIFO) data structure: the last element pushed is the first one popped.  
This implementation uses a singly linked list internally (each node points to the next), and provides the common stack operations:

- `push(T data)` — push an element onto the top of the stack.  
- `peek()` — view (but do not remove) the top element.  
- `pop()` — remove and return the top element.  
- `isEmpty()` — check whether the stack is empty.  
- `getSize()` — return the number of elements currently in the stack.  
- `clear()` — remove all elements from the stack.  
- `contains(T data)` — check whether the stack contains a given element.

## Features

- Generic: works with any object type `T`.  
- Linked structure: no fixed capacity; grows and shrinks dynamically as you push/pop.  
- Standard stack semantics.  
- Methods properly throw exceptions in invalid states (e.g., `peek()` or `pop()` when empty).  
- Clean `toString()` representation of the stack contents.

## Usage

```java
LinkedStack<Integer> stack = new LinkedStack<>();
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek()); // prints 30

stack.pop();
System.out.println(stack);        // prints something like [20, 10]

System.out.println("Contains 20? " + stack.contains(20)); // true
stack.clear();
System.out.println("Is empty? " + stack.isEmpty());       // true
````

## Constructors

| Constructor           | Description                                                         |
| --------------------- | ------------------------------------------------------------------- |
| `LinkedStack()`       | Creates an empty stack.                                             |
| `LinkedStack(T data)` | Creates a stack with one element (`data`) pushed onto it initially. |

## Exceptions

* `peek()` and `pop()` throw `IllegalStateException` if the stack is empty.
* `contains()` handles `null` safely (compares via `==` when appropriate).

## Performance

* `push(...)` is O(1) — constant time for adding to the top.
* `pop()`, `peek()`, `isEmpty()`, `getSize()` are O(1).
* `contains(...)` is O(n) — may need to traverse all elements.
* `clear()` is O(1) in semantics (it simply resets pointers and size), making all elements eligible for garbage collection.

## Example Test

A simple test class (`LinkedStackTest.java`) demonstrates the use and behavior of this implementation:

```java
LinkedStack<Integer> stack = new LinkedStack<>();

System.out.println("Is empty? " + stack.isEmpty()); // true
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println("After pushing 10, 20, 30: " + stack);
System.out.println("Item peeked: " + stack.peek());
System.out.println("Stack size: " + stack.getSize());
stack.pop();
System.out.println("After popping: " + stack);
System.out.println("Contains 20? " + stack.contains(20));
System.out.println("Contains 100? " + stack.contains(100));
stack.clear();
System.out.println("After clearing: " + stack);
System.out.println("Is empty? " + stack.isEmpty());
```

## Contributing

Contributions are welcome! If you find bugs, want to add features (for example, implementing an **iterator**, supporting **shrink-to-fit**, thread-safety, or additional utility methods), feel free to open a pull request.

## License

This class is part of the [Java Data Structures](https://github.com/Eyadeltaher/java-data-structures) project and licensed under the [MIT License](../LICENSE).
---

*Happy coding!*
