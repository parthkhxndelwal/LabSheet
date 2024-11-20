class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current != null) {
            if (current.next != null)
                current.next.prev = current.prev;
            if (current.prev != null)
                current.prev.next = current.next;
        } else {
            System.out.println("Value not found!");
        }
    }

    public void traverse() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Doubly Linked List:");
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.delete(2);
        list.traverse();
        
    }
}
