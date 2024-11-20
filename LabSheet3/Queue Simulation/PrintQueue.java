import java.util.LinkedList;
import java.util.Queue;

class PrintQueue {

    private Queue<String> queue;

    // Constructor to initialize the print queue
    public PrintQueue() {
        queue = new LinkedList<>();
    }

    // Method to add a document to the queue (enqueue)
    public void enqueue(String document) {
        queue.add(document);
        System.out.println("Added to queue: " + document);
    }

    // Method to process the next document in the queue (dequeue)
    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("No documents to process!");
            return null;
        }
        String processedDoc = queue.poll();
        System.out.println("Processing: " + processedDoc);
        return processedDoc;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        // Create a PrintQueue object
        PrintQueue printQueue = new PrintQueue();

        // Add documents to the queue
        printQueue.enqueue("doc1");
        printQueue.enqueue("doc2");

        // Process documents
        printQueue.dequeue(); // Expected: "Processing: doc1"
        printQueue.dequeue(); // Expected: "Processing: doc2"

        // Try processing when queue is empty
        printQueue.dequeue(); // Expected: "No documents to process!"
    }
}
