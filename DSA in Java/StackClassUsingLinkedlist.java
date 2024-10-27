public class StackClassUsingLinkedlist {
    // Inner class to represent a node in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to initialize a new node
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Inner class to implement stack operations using linked list
    static class stack {
        public static Node head;

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Method to add an element to the top of the stack
        public static void push(int data) {
            Node newNode = new Node(data); // Create a new node
            if (isEmpty()) {
                head = newNode; // If stack is empty, set head to new node
                return;
            }
            newNode.next = head; // Link the new node to the current head
            head = newNode; // Update head to the new node
        }

        // Method to remove and return the top element of the stack
        public static int pop() {
            if (isEmpty()) {
                return -1; // If stack is empty, return -1
            }
            int top = head.data; // Store the data of the top node
            head = head.next; // Update head to the next node
            return top; // Return the stored data
        }

        // Method to return the top element of the stack without removing it
        public static int peek() {
            if (isEmpty()) {
                return -1; // If stack is empty, return -1
            }
            return head.data; // Return the data of the top node
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }
    }
}