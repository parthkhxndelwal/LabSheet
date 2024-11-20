class ArrayQueue {
    private int[] queue; // Array to store queue elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int capacity; // Maximum capacity of the queue
    private int size; // Current size of the queue

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = value;
        size++;
    }

    // Method to remove and return the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeuedValue = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return dequeuedValue;
    }

    // Method to return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // Perform queue operations
        queue.enqueue(1);
        System.out.println("Enqueued 1");
        queue.enqueue(2);
        System.out.println("Enqueued 2");

        System.out.println("Front element (peek): " + queue.peek()); 
        System.out.println("Dequeued element: " + queue.dequeue()); 
        System.out.println("Front element after dequeue (peek): " + queue.peek());
    }
}
