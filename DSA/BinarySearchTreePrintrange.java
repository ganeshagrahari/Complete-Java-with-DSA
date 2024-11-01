public class BinarySearchTreePrintrange {
     // Define a static nested class Node to represent each node in the tree
     static class Node {
        int data; // Data stored in the node
        Node left; // Reference to the left child node
        Node right; // Reference to the right child node

        // Constructor to initialize the node with data
        Node(int data) {
            this.data = data;
        }
    }

    // Method to insert a value into the binary search tree
    public static Node insert(Node root, int val) {
        // If the root is null, create a new node with the given value and return it
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // If the value to be inserted is less than the current node's data
        if (val < root.data) {
            // Insert the value in the left subtree
            root.left = insert(root.left, val);
        } else {
            // If the value to be inserted is greater than or equal to the current node's data
            // Insert the value in the right subtree
            root.right = insert(root.right, val);
        }
        // Return the root node after insertion
        return root;
    }

    // Method for inorder traversal of the binary search tree
    public static void inorder(Node root) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }
        // Traverse the left subtree
        inorder(root.left);
        // Visit the current node (print its data)
        System.out.print(root.data + " ");
        // Traverse the right subtree
        inorder(root.right);
    }

    //print in range
    public static void printInRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);

        }
        else if(root.data >=Y){
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }

    // Main method to test the binary search tree implementation
    public static void main(String[] args) {
        // Array of values to be inserted into the binary search tree
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null; // Initialize the root of the tree as null

        // Insert each value from the array into the binary search tree
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Perform inorder traversal of the tree and print the values
        inorder(root);
        System.out.println(); // Print a newline after the traversal
        System.out.println("Number between range are: ");
        printInRange(root, 2, 5);
    } 
    
}
