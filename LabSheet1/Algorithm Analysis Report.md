# Algorithm Analysis Report

## Lab Sheet 1 - Stack Operations

### Stack Class:
- **Operations**:
  - **Push**: Adds an element to the top of the stack. Time Complexity: \( O(1) \).
  - **Pop**: Removes and returns the top element from the stack. Time Complexity: \( O(1) \).
  - **Peek**: Returns the top element without removing it. Time Complexity: \( O(1) \).
  - **Size**: Returns the current size of the stack. Time Complexity: \( O(1) \).
  - **Display**: Displays the entire stack. Time Complexity: \( O(n) \), where \( n \) is the number of elements in the stack.

- **Complexity Summary**:
  - The operations `push`, `pop`, and `peek` are constant time operations, making the stack efficient for applications where data is only accessed or modified at the top.
  - **Space Complexity**: \( O(n) \), where \( n \) is the maximum number of elements that can be stored in the stack.

### Additional Functions

- **reverse_string**:
  - **Description**: Uses a stack to reverse a given string by pushing each character and then popping them in reverse order.
  - **Time Complexity**: \( O(n) \), where \( n \) is the length of the string.
  - **Space Complexity**: \( O(n) \), due to storage of characters on the stack.

- **is_palindrome**:
  - **Description**: Checks if a string is a palindrome by pushing characters onto the stack and comparing them in reverse order.
  - **Time Complexity**: \( O(n) \), where \( n \) is the length of the string.
  - **Space Complexity**: \( O(n) \), due to the storage of characters.


### Conclusion:
The stack operations and string operations (like RLE and KMP) implemented in these lab exercises demonstrate efficient time complexities. However, for larger datasets, array traversal and matrix operations may become time-consuming. The implemented algorithms provide a foundational understanding of efficient data structure manipulation and string processing.
