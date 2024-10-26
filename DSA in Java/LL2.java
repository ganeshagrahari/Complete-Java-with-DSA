import java.util.*;
public class LL2{
    public static void main(String []agrs){
        LinkedList<String> list =new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("Linkedlist");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("null ");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
