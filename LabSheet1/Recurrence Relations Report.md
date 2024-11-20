# Recurrence Relations Report

## Introduction
This report explains the recurrence relations for algorithms used in the Lab Sheet codes. Recurrence relations help in understanding the time complexity of recursive algorithms by defining how the running time increases with the input size.

---

## Recurrence Relations in Lab Sheet 1
In Lab Sheet 1, the algorithms implemented are iterative, so they don’t directly involve recurrence relations. However, understanding potential recurrence relations in stack operations can provide insights into cases where recursion might be employed.

### Example of Recurrence Relation for Recursive Stack Operations:
1. **Recursive Reverse String**:
   - **Recurrence Relation**: \( T(n) = T(n-1) + O(1) \)
   - **Explanation**: In a recursive approach to reversing a string, each recursive call processes one character (constant time) and then calls itself with the remaining \( n-1 \) characters.
   - **Solution**: Solving this recurrence yields \( T(n) = O(n) \), confirming linear complexity.

2. **Recursive Palindrome Check**:
   - **Recurrence Relation**: \( T(n) = T(n-1) + O(1) \)
   - **Explanation**: Similar to string reversal, each recursive call checks one character from the start and end of the string.
   - **Solution**: The recurrence solves to \( T(n) = O(n) \).

---

## Summary
The recurrence relations in the given algorithms confirm that the iterative solutions provided are optimal. For stack operations, array traversal, and string processing tasks, iterative approaches are more efficient due to their lower space complexity. Recursive approaches may illustrate similar time complexity but typically require additional memory for each recursive call stack frame.
