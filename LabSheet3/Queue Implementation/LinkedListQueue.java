class LinkedListQueue {
    // Node class to represent each element in the queue
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Points to the front of the queue
    private Node rear; // Points to the rear of the queue

    // Constructor to initialize the queue
    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // If the queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode; // Link the new node to the current rear
            rear = newNode; // Update the rear to the new node
        }
    }

    // Method to remove and return the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next; // Move the front pointer to the next node
        if (front == null) { // If the queue becomes empty
            rear = null;
        }
        return dequeuedValue;
    }

    // Method to return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        // Perform queue operations
        queue.enqueue(1);
        System.out.println("Enqueued 1");
        queue.enqueue(2);
        System.out.println("Enqueued 2");

        System.out.println("Dequeued element: " + queue.dequeue()); 
        System.out.println("Front element (peek): " + queue.peek()); 
    }
}
