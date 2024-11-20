#### Data Structures
# Laboratory Sheet 2

## Prerequisites:
If Python isn't already installed on your system, open Command Prompt and run the following command:
```bash
winget install Python.Python.3.12
```


## Steps to Run:
To run the code
```bash
cd LabSheet2
python main.py
```

## Explanation of Code Sections:

### TwoDimensionalArray Class:
- Implements a 2D array with methods for:
  - **insert_row** and **insert_column**: Inserts rows or columns at specified indices.
  - **delete_row** and **delete_column**: Deletes rows or columns at specified indices.
  - **traverse**: Prints the array.
  - **transpose**: Computes and returns the transpose of the matrix.

- **Complexity Analysis**:
  - Row and column insertion/deletion: \( O(n) \) for insertion/deletion in a row or column.
  - Traversal: \( O(n \times m) \), where \( n \) and \( m \) are row and column counts.
  - Transpose: \( O(n \times m) \).

### StringAlgorithms Class:
- Implements:
  - **kmp_pattern_search**: Uses the Knuth-Morris-Pratt (KMP) algorithm for finding a pattern in a string.
    - **Complexity**: Best and worst-case time complexity is \( O (n + m) \), where \( n \) is the text length and \( m \) is the pattern length.
  - **run_length_encoding**: Compresses a string using Run Length Encoding (RLE).
    - **Complexity**: \( O(n) \), where \( n \) is the length of the string.
