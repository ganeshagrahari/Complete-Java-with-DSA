import java.util.*;
public class QueueUsingCollections {
    public static void main(String[] args) {
       // Queue<Integer> q=new LinkedList<>();
       Queue<Integer> q=new ArrayDeque<>();


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
