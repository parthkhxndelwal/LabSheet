# Recurrence Relations Report

## Introduction
This report explains the recurrence relations for algorithms used in the Lab Sheet codes. Recurrence relations help in understanding the time complexity of recursive algorithms by defining how the running time increases with the input size.

---
## Recurrence Relations
Lab Sheet 2 contains mainly iterative solutions, but the string pattern matching and array traversal algorithms can be analyzed with recurrence relations when a recursive approach is applied.

### KMP Pattern Matching (Recursive Analysis)
1. **Recursive KMP Pattern Matching**:
   - **Recurrence Relation**: \( T(n) = T(n-m) + O(m) \)
   - **Explanation**: For each matching attempt, the KMP algorithm processes \( m \) characters (pattern length) in constant time due to the precomputed LPS array.
   - **Solution**: This relation simplifies to \( O(n) \), confirming efficient linear performance.

### Matrix Transpose (Recursive)
1. **Recursive Matrix Transpose**:
   - **Recurrence Relation**: \( T(n \times m) = T(n-1 \times m) + O(m) \)
   - **Explanation**: For each recursive call, the algorithm processes one row (or column) of \( m \) elements.
   - **Solution**: This simplifies to \( T(n \times m) = O(n \times m) \), consistent with the iterative solution.

### Run Length Encoding (RLE) (Recursive)
1. **Recursive RLE**:
   - **Recurrence Relation**: \( T(n) = T(n-1) + O(1) \)
   - **Explanation**: Each recursive call processes one character, moving to the next.
   - **Solution**: Solving the recurrence gives \( T(n) = O(n) \).

---

## Summary
The recurrence relations in the given algorithms confirm that the iterative solutions provided are optimal. For stack operations, array traversal, and string processing tasks, iterative approaches are more efficient due to their lower space complexity. Recursive approaches may illustrate similar time complexity but typically require additional memory for each recursive call stack frame.
