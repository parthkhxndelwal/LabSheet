# Data Structures: Laboratory Sheet

## Prerequisites:
If Python isn't already installed on your system, open Command Prompt and run the following command:
```bash
winget install Python.Python.3.12
```


## Steps to Run:
To run the code for Lab Sheet 1:
```bash
cd LabSheet1
python main.py
```
To run the code for Lab Sheet 2:
```bash
cd LabSheet2
python main.py
```
## Lab Sheet 1:
### Explanation of Code Sections:

#### Stack Class:
- Implements a Stack data structure with methods for:
  - **push**: Adds an item to the top of the stack.
  - **pop**: Removes and returns the top item from the stack.
  - **peek**: Returns the top item without removing it.
  - **size**: Returns the current size of the stack.
  - **display**: Prints the current contents of the stack.

- **Complexity Analysis**:
  - Push and Pop operations: \( O(1) \), as both operations only involve adding or removing an element at the end of the list.
  - Peek and Size: \( O(1) \), as they simply return values without traversing the stack.

#### Additional Functions:

- **reverse_string**: Uses a stack to reverse a string by pushing each character and then popping it to construct the reversed string.
  - **Complexity**: \( O(n) \), where \( n \) is the length of the string.

- **is_palindrome**: Checks if a given string is a palindrome by pushing characters onto the stack and comparing them while popping.
  - **Complexity**: \( O(n) \), where \( n \) is the length of the string.

- **example_operations**: Demonstrates specific operations with the stack:
  - Pushes five elements onto the stack and pops two, displaying the updated top element and size.

- **Overall Complexity Analysis**:
  - Stack operations, string reversal, and palindrome check: \( O(n) \) complexity, making them efficient for handling moderate-sized inputs.


## Lab Sheet 2:
Explanation of Code Sections:
TwoDimensionalArray Class:

## Explanation of Code Sections:

#### TwoDimensionalArray Class:
- Implements a 2D array with methods for:
  - **insert_row** and **insert_column**: Inserts rows or columns at specified indices.
  - **delete_row** and **delete_column**: Deletes rows or columns at specified indices.
  - **traverse**: Prints the array.
  - **transpose**: Computes and returns the transpose of the matrix.

- **Complexity Analysis**:
  - Row and column insertion/deletion: \( O(n) \) for insertion/deletion in a row or column.
  - Traversal: \( O(n \times m) \), where \( n \) and \( m \) are row and column counts.
  - Transpose: \( O(n \times m) \).

#### StringAlgorithms Class:
- Implements:
  - **kmp_pattern_search**: Uses the Knuth-Morris-Pratt (KMP) algorithm for finding a pattern in a string.
    - **Complexity**: Best and worst-case time complexity is \( O (n + m) \), where \( n \) is the text length and \( m \) is the pattern length.
  - **run_length_encoding**: Compresses a string using Run Length Encoding (RLE).
    - **Complexity**: \( O(n) \), where \( n \) is the length of the string.
