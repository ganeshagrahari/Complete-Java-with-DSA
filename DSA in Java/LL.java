public class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;
    }

    // Inner class to represent a node in the linked list
    class Node {
        String data;
        Node next;

        // Constructor to initialize a new node
        Node(String Data) {
            this.data = Data; // Corrected the assignment
            this.next = null;
            size++;
        }
    }

    // Method to add a node at the beginning of the list
    public void AddFirst(String data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If list is empty, set head to new node
            return;
        }
        newNode.next = head; // Link the new node to the current head
        head = newNode; // Update head to the new node
    }

    // Method to add a node at the end of the list
    public void AddLast(String data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If list is empty, set head to new node
            return;
        }
        Node currNode = head;
        while (currNode.next != null) { // Traverse to the end of the list
            currNode = currNode.next;
        }
        currNode.next = newNode; // Link the last node to the new node
    }

    // Method to print the linked list
    public void printLinkedlist() {
        if (head == null) {
            System.out.println("List is empty!"); // If list is empty, print message
            return;
        }
        Node currNode = head;
        while (currNode != null) { // Traverse the list
            System.out.print(currNode.data + " -> "); // Print the data
            currNode = currNode.next;
        }
        System.out.println("Null"); // End of list
    }

    // Delete the first node
public void deleteFirst() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    size--;
    head = head.next; // Move head to the next node
    
}

// Delete the last node
public void deleteLast() {
    if (head == null) {
        System.out.println("List is empty!");
        return;
    }
    size--;
    if (head.next == null) {
        head = null; // If there's only one node, set head to null
        return;
    }
    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null) { // Traverse to the second last node
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null; // Remove the last node by setting second last's next to null
    
}
public int getSize(){
    return size;
}

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        LL list = new LL();
        list.AddFirst("a");
        list.AddFirst("is");
        list.printLinkedlist();

        list.AddLast("List");
        list.printLinkedlist();
        list.AddFirst("this");
        list.printLinkedlist();
        list.deleteLast();
        list.printLinkedlist();
        list.deleteFirst();
        list.printLinkedlist();

        System.out.println(list.getSize());

        list.AddFirst("This");
        System.out.println(list.getSize());
    }
}