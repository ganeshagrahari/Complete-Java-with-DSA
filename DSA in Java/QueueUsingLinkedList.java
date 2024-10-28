public class QueueUsingLinkedList {
    // Node class represents each element in the linked list
    static class Node {
        int data; // Data stored in the node
        Node next; // Pointer to the next node

        // Constructor to initialize a new node
        public Node(int data) {
            this.data = data; // Set the data
            next = null; // Initialize next as null
        }
    }

    // Queue class implements a queue using a linked list
    static class Queue {
        Node head = null; // Pointer to the front of the queue
        Node tail = null; // Pointer to the rear of the queue

        // Check if the queue is empty
        public boolean isEmpty() {
            return head == null && tail == null; // Queue is empty if both head and tail are null
        }

        // Enqueue (add) a new element to the queue
        public void add(int data) {
            Node newNode = new Node(data); // Create a new node with the given data
            if (tail == null) { // If the queue is empty
                tail = head = newNode; // Both head and tail point to the new node
                return;
            }
            tail.next = newNode; // Link the current tail node's next pointer to the new node
            tail = newNode; // Update the tail pointer to point to the new node
        }

        // Dequeue (remove) an element from the front of the queue
        public int remove() {
            if (isEmpty()) { // If the queue is empty
                System.out.println("Queue is empty"); // Print a message
                return -1; // Return -1 to indicate the queue is empty
            }
            int front = head.data; // Get the data from the front node
            head = head.next; // Move the head pointer to the next node
            if (head == null) { // If the queue becomes empty after removal
                tail = null; // Set the tail to null as well
            }
            return front; // Return the data from the removed node
        }

        // Peek (access) the front element of the queue without removing it
        public int peek() {
            if (isEmpty()) { // If the queue is empty
                System.out.println("Empty queue!"); // Print a message
                return -1; // Return -1 to indicate the queue is empty
            }
            return head.data; // Return the data from the front node
        }
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        Queue q = new Queue(); // Create a new queue
        q.add(1); // Enqueue 1
        q.add(2); // Enqueue 2
        q.add(3); // Enqueue 3
        q.add(4); // Enqueue 4
        q.add(5); // Enqueue 5

        // Dequeue and print elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print the front element
            q.remove(); // Dequeue the front element
        }
    }
}