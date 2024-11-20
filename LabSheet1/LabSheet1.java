import java.util.Stack;

public class LabSheet1 {

    // Additional function to reverse a string using stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Push all characters of the string onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        
        // Pop characters to get them in reverse order
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // Function to check if a string is a palindrome using stack
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        String normalized = str.toLowerCase();

        // Push all characters onto the stack
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        // Check palindrome by popping characters
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Example of performing specific operations: 5 PUSH and 2 POP
    public static void exampleOperations() {
        Stack<Integer> stack = new Stack<>();

        // Push 5 elements onto the stack
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println("Element " + i + " pushed onto the stack.");
        }

        // Pop 2 elements from the stack
        if (!stack.isEmpty()) {
            System.out.println("Element " + stack.pop() + " popped from the stack.");
        }
        if (!stack.isEmpty()) {
            System.out.println("Element " + stack.pop() + " popped from the stack.");
        }

        // Display the current top element and size of the stack
        if (!stack.isEmpty()) {
            System.out.println("Current top element: " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }
        System.out.println("Current stack size: " + stack.size());
    }

    public static void main(String[] args) {
        // 1. Testing stack operations
        System.out.println("Stack Operations:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println("Element 10 pushed onto the stack.");
        stack.push(20);
        System.out.println("Element 20 pushed onto the stack.");
        stack.push(30);
        System.out.println("Element 30 pushed onto the stack.");
        System.out.println("Element " + stack.pop() + " popped from the stack.");
        System.out.println("Stack contents: " + stack);

        // 2. Reverse a string
        System.out.println("\nString Reversal:");
        String testString = "Hello";
        System.out.println("Original String: " + testString);
        System.out.println("Reversed String: " + reverseString(testString));

        // 3. Palindrome check
        System.out.println("\nPalindrome Check:");
        String palindromeStr = "madam";
        System.out.println("Is '" + palindromeStr + "' a palindrome? " + isPalindrome(palindromeStr));

        // 4. Specific operations with 5 PUSH and 2 POP
        System.out.println("\nExample Operations:");
        exampleOperations();
    }
}
