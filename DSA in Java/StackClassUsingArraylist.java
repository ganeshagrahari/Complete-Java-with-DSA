import java.util.ArrayList;

public class StackClassUsingArraylist {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek()); // Print the top element
            Stack.pop(); // Remove the top element
        }
    }
}  