# Algorithm Analysis Report

## Lab Sheet 2 - Advanced Array and String Operations

### TwoDimensionalArray Class:
- **Operations**:
  - **insert_row** and **insert_column**:
    - **Description**: Inserts a row or column at a specified index.
    - **Time Complexity**: \( O(n) \), where \( n \) is the number of elements in the row or column.
  - **delete_row** and **delete_column**:
    - **Description**: Deletes a row or column from the 2D array.
    - **Time Complexity**: \( O(n) \), similar to insertion.
  - **traverse**:
    - **Description**: Prints all elements in the 2D array.
    - **Time Complexity**: \( O(n \times m) \), where \( n \) and \( m \) are the row and column counts.
  - **transpose**:
    - **Description**: Returns the transpose of the 2D array.
    - **Time Complexity**: \( O(n \times m) \), since every element is accessed and stored in the transposed matrix.

- **Complexity Summary**:
  - The operations on the 2D array are efficient for small-to-moderate sizes, but traversal and transpose can be costly for larger matrices.
  - **Space Complexity**: \( O(n \times m) \), where \( n \) and \( m \) are the dimensions of the array.

### StringAlgorithms Class:

- **kmp_pattern_search**:
  - **Description**: Implements the Knuth-Morris-Pratt (KMP) algorithm for pattern matching.
  - **Time Complexity**: \( O(n + m) \), where \( n \) is the length of the text and \( m \) is the length of the pattern.
  - **Space Complexity**: \( O(m) \), for storing the LPS (Longest Prefix Suffix) array.

- **run_length_encoding**:
  - **Description**: Compresses a string using Run Length Encoding (RLE).
  - **Time Complexity**: \( O(n) \), where \( n \) is the length of the string.
  - **Space Complexity**: \( O(n) \), for storing the compressed form.

---

### Conclusion:
The stack operations and string operations (like RLE and KMP) implemented in these lab exercises demonstrate efficient time complexities. However, for larger datasets, array traversal and matrix operations may become time-consuming. The implemented algorithms provide a foundational understanding of efficient data structure manipulation and string processing.
