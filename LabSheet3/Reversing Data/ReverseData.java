import java.util.Stack;

class ReverseData {

    // Function to reverse a string using a stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original String: " + input);

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
