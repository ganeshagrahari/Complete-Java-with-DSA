import java.util.Stack;

public class reverseAStack {

    // Method to push an element to the bottom of the stack
    public static void pushBottom(int data, Stack<Integer> s) {
        // Base case: if the stack is empty, push the data and return
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Recursive case: pop the top element and call pushBottom recursively
        int top = s.pop();
        pushBottom(data, s);
        // After the recursive call, push the top element back to the stack
        s.push(top);
    }

    // Method to reverse the stack
    public static void reverse(Stack<Integer> s) {
        // Base case: if the stack is empty, return
        if (s.isEmpty()) {
            return;
        }
        // Recursive case: pop the top element and call reverse recursively
        int top = s.pop();
        reverse(s);
        // After the recursive call, push the popped element to the bottom of the stack
        pushBottom(top, s);
    }

    // Main method to test the stack reversal
    public static void main(String args[]) {
        // Create a new stack and push elements onto it
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        // Reverse the stack
        reverse(s);
        
        // Print and pop elements from the stack until it is empty
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }
    }
}