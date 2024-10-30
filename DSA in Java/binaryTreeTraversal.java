import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeTraversal {
    // Inner class to represent a node in the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize the node with data
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Static class to handle binary tree operations
    static class BinaryTree {
        static int idx = -1;

        // Method to build a binary tree from an array of integers
        public static Node buildTree(int nodes[]) {
            idx++;
            // If the current index points to -1, return null (no node)
            if (nodes[idx] == -1) {
                return null;
            }
            // Create a new node with the current value
            Node newNode = new Node(nodes[idx]);
            // Recursively build the left and right subtrees
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    //inorder
    public static void inorder(Node root){
        if(root ==null){
            return;

        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    //postorder:
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }

   // Level order :---->
public static void levelorder(Node root) {
    // If the root is null, return immediately
    if (root == null) {
        return;
    }

    // Create a queue to hold nodes during traversal
    Queue<Node> q = new LinkedList<>();
    // Add the root node to the queue
    q.add(root);
    // Add a null marker to indicate the end of the current level
    q.add(null);

    // Loop until the queue is empty
    while (!q.isEmpty()) {
        // Remove the front node from the queue
        Node currNode = q.remove();

        // If the current node is null, it indicates the end of the current level
        if (currNode == null) {
            // Print a newline to separate levels
            System.out.println();
            // If the queue is empty, break out of the loop
            if (q.isEmpty()) {
                break;
            } else {
                // Otherwise, add another null marker to indicate the end of the next level
                q.add(null);
            }
        } else {
            // Print the data of the current node
            System.out.print(currNode.data + " ");
            // If the left child exists, add it to the queue
            if (currNode.left != null) {
                q.add(currNode.left);
            }
            // If the right child exists, add it to the queue
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }
}

    public static void main(String[] args) {
        // Array representing the binary tree structure
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // Build the binary tree from the array
        Node root = BinaryTree.buildTree(nodes);
        // Print the root node's data
        System.out.println(root.data);
        //print the preorder sequence:
        System.out.println("Preorder :");
        preorder(root);
        System.out.println("inorder:");
        inorder(root);
        System.out.println("postorder:");
        postorder(root);
        System.out.println("level order:");
        levelorder(root);
    }
}
