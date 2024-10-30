public class BinaryTreeBuild {
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

    public static void main(String[] args) {
        // Array representing the binary tree structure
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // Build the binary tree from the array
        Node root = BinaryTree.buildTree(nodes);
        // Print the root node's data
        System.out.println(root.data);
    }
}