import java.util.Stack;

public class QueueUsing2Stacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Check if the queue is empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Enqueue (add) an element to the queue
        public void add(int data) {
            // Push the element onto stack s1
            s1.push(data);
        }

        // Dequeue (remove) an element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            // Transfer elements from s1 to s2 if s2 is empty
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            // Pop the element from stack s2
            return s2.pop();
        }

        // Peek (access) the front element of the queue without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            // Transfer elements from s1 to s2 if s2 is empty
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            // Return the top element of stack s2
            return s2.peek();
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