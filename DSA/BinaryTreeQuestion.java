public class BinaryTreeQuestion {
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
    //Count of nodes:-
    public static int countOfNodes(Node root){

        if(root ==null){
            return 0;
        }
        int left=countOfNodes(root.left);
        int right=countOfNodes(root.right);

        return left+right+1;
    }
    //Sum of nodes:---
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    //Height of tree:--
     public static int height(Node root){

        if(root==null){
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int myHeight=Math.max(leftHeight,rightHeight)+1;
        return myHeight;

     }

   
    

    public static void main(String[] args) {
        // Array representing the binary tree structure
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // Build the binary tree from the array
        Node root = BinaryTree.buildTree(nodes);
        // Print the root node's data
        System.out.println("root data:");
        System.out.println(root.data);
        System.out.println("The of nodes in the binary tree is:");
        System.out.println(countOfNodes(root));
        System.out.println("The sum of nodes in the binary tree is:");
        System.out.println(sumOfNodes(root));
        System.out.println("The height of the binary tree is:");
        System.out.println(height(root));
        
}
}
