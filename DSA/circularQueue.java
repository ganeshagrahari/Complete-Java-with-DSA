public class circularQueue {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue (add)
        public void Enqueue(int data) {
            if (isFull()) {
                System.out.println("Full queue!");
                return;
            }
            // First element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue (remove)
        public int Dequeue() {
            if (isEmpty()) {
                System.out.println("Empty queue!");
                return -1;
            }
            int result = arr[front];
            // Only one element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek (accessing)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue!");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        System.out.println(q.Dequeue());
        q.Enqueue(6);
        System.out.println(q.Dequeue());
        q.Enqueue(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.Dequeue();
        }
    }
}