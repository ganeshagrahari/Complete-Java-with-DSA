public class BinarySerchTreeDeletion {
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
   // Deleting a node from binary search tree
public static Node delete(Node root, int val) {
    // If the value to be deleted is less than the current node's data
    if (val < root.data) {
        // Recur for the left subtree
        root.left = delete(root.left, val);
    } 
    // If the value to be deleted is greater than the current node's data
    else if (val > root.data) {
        // Recur for the right subtree
        root.right = delete(root.right, val);
    } 
    // If the current node's data is equal to the value to be deleted
    else {
        // Case 1: Node to be deleted is a leaf node (no children)
        if (root.left == null && root.right == null) {
            return null; // Simply delete the node by returning null
        }
        // Case 2: Node to be deleted has only one child
        // If the node has no left child, return the right child
        if (root.left == null) {
            return root.right;
        } 
        // If the node has no right child, return the left child
        else if (root.right == null) {
            return root.left;
        }
        // Case 3: Node to be deleted has two children
        // Find the inorder successor (smallest node in the right subtree)
        Node IS = inorderSucc(root.right);
        // Replace the current node's data with the inorder successor's data
        root.data = IS.data;
        // Delete the inorder successor
        root.right = delete(root.right, IS.data);
    }
    // Return the root node after deletion
    return root;
}

// Method to find the inorder successor (smallest node in the right subtree)
public static Node inorderSucc(Node root) {
    // Loop to find the leftmost leaf
    while (root.left != null) {
        root = root.left;
    }
    // Return the leftmost leaf
    return root;
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
        System.out.println("tree before deletion:");
        inorder(root);
        System.out.println(); // Print a newline after the traversal
        System.out.println("Tree after deletion:");
        delete(root, 4);
        inorder(root);
    }
    
}
