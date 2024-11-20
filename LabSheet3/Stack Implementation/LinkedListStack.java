class LinkedListStack {
    // Node class to represent each element in the stack
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Top of the stack

    // Constructor to initialize the stack
    public LinkedListStack() {
        head = null;
    }

    // Method to add an element to the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head; // Link the new node to the current head
        head = newNode; // Update the head to the new node
    }

    // Method to remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedValue = head.data;
        head = head.next; // Move the head to the next node
        return poppedValue;
    }

    // Method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Perform stack operations
        stack.push(1);
        System.out.println("Pushed 1");
        stack.push(2);
        System.out.println("Pushed 2");

        System.out.println("Top element (peek): " + stack.peek()); 
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Top element after pop (peek): " + stack.peek()); 
    }
}
