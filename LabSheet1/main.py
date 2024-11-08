# Lab Assignment 1 - Data Structures (Stack Implementation)
# Objective:
# This lab sheet focuses on understanding and implementing the Stack data structure, 
# emphasizing the Last In First Out (LIFO) principle. It involves defining a Stack Abstract Data Type (ADT), 
# executing basic operations (push and pop), and exploring real-world applications.
# Additionally, it includes enhancements for the Stack class to handle various data types, 
# reverse strings, check palindromes, and calculate stack size.

# Define the Stack class with essential operations and additional functionalities.
class Stack:
    def __init__(self):
        # Initialize an empty list to represent the stack
        self.items = []

    def is_empty(self):
        # Check if the stack is empty
        return len(self.items) == 0

    def push(self, item):
        # Add an item to the top of the stack
        self.items.append(item)
        print(f"Element {item} pushed onto the stack.")

    def pop(self):
        # Remove and return the top item from the stack
        if self.is_empty():
            print("Stack Underflow. Cannot pop element.")
            return None
        popped_item = self.items.pop()
        print(f"Element {popped_item} popped from the stack.")
        return popped_item

    def peek(self):
        # Return the top item without removing it
        if self.is_empty():
            print("Stack is empty.")
            return None
        return self.items[-1]

    def size(self):
        # Return the current size of the stack
        return len(self.items)

    def display(self):
        # Display the current elements in the stack
        print("Stack contents:", self.items)

# Additional function to reverse a string using stack
def reverse_string(s):
    stack = Stack()
    # Push all characters of the string onto the stack
    for char in s:
        stack.push(char)
    
    # Pop characters to get them in reverse order
    reversed_str = ""
    while not stack.is_empty():
        reversed_str += stack.pop()
    return reversed_str

# Function to check if a string is a palindrome using stack
def is_palindrome(s):
    # Normalize the string
    s = s.lower()
    stack = Stack()
    # Push all characters of the string onto the stack
    for char in s:
        stack.push(char)
    
    # Check palindrome by popping characters
    for char in s:
        if char != stack.pop():
            return False
    return True

# Example of performing specific operations: 5 PUSH and 2 POP
def example_operations():
    stack = Stack()
    # Push 5 elements onto the stack
    for i in range(1, 6):
        stack.push(i)
    
    # Pop 2 elements from the stack
    stack.pop()
    stack.pop()

    # Display the current top element and size of the stack
    print("Current top element:", stack.peek())
    print("Current stack size:", stack.size())

# Main execution and testing of implemented functions
if __name__ == "__main__":
    # 1. Testing stack operations
    print("Stack Operations:")
    stack = Stack()
    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.pop()
    stack.display()

    # 2. Reverse a string
    print("\nString Reversal:")
    test_string = "Hello"
    print("Original String:", test_string)
    print("Reversed String:", reverse_string(test_string))

    # 3. Palindrome check
    print("\nPalindrome Check:")
    palindrome_str = "madam"
    print(f"Is '{palindrome_str}' a palindrome?", is_palindrome(palindrome_str))

    # 4. Specific operations with 5 PUSH and 2 POP
    print("\nExample Operations:")
    example_operations()
