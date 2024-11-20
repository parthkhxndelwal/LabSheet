#### Data Structures
# Laboratory Sheet 1

## Prerequisites:
If Python isn't already installed on your system, open Command Prompt and run the following command:
```bash
winget install Python.Python.3.12
```


## Steps to Run:
### Clone the repository:
```bash
git clone https://github.com/parthkhxndelwal/LabSheet
cd LabSheet1
```
### Execute the Java Program:
```cmd
```
## Explanation of Code Sections:

### Stack Class:
- Implements a Stack data structure with methods for:
  - **push**: Adds an item to the top of the stack.
  - **pop**: Removes and returns the top item from the stack.
  - **peek**: Returns the top item without removing it.
  - **size**: Returns the current size of the stack.
  - **display**: Prints the current contents of the stack.

- **Complexity Analysis**:
  - Push and Pop operations: \( O(1) \), as both operations only involve adding or removing an element at the end of the list.
  - Peek and Size: \( O(1) \), as they simply return values without traversing the stack.

### Additional Functions:

- **reverse_string**: Uses a stack to reverse a string by pushing each character and then popping it to construct the reversed string.
  - **Complexity**: \( O(n) \), where \( n \) is the length of the string.

- **is_palindrome**: Checks if a given string is a palindrome by pushing characters onto the stack and comparing them while popping.
  - **Complexity**: \( O(n) \), where \( n \) is the length of the string.

- **example_operations**: Demonstrates specific operations with the stack:
  - Pushes five elements onto the stack and pops two, displaying the updated top element and size.

- **Overall Complexity Analysis**:
  - Stack operations, string reversal, and palindrome check: \( O(n) \) complexity, making them efficient for handling moderate-sized inputs.