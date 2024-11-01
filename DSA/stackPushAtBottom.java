import java.util.Stack;

public class stackPushAtBottom {
    public static void pushBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushBottom(data, s);
        s.push(top);

    }
    public static void main(String args []){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }

    }
    
}
