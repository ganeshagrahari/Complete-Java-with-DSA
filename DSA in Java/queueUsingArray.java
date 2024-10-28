public class queueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int size){
            arr=new int[size];
            this.size=size;

        }
        public static boolean isEmpty(){
            return rear ==-1;
        }

        //Enqueue(add)
        public static void Enqueue(int data){
            if(rear==size-1){
                System.out.println("full queue!");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        //Dequeue(remove)
        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("Empty queue!");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;

        }

        //peek(accessing)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue!");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }
    }
    
}
