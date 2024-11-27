<<<<<<< HEAD
import java.util.HashSet;
import java.util.Iterator;
public class Hashset{
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        //Insert
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);


        //Search:
        if(hs.contains(1)){
            System.out.println("1 is present in the hashset");
        }
        else{
            System.out.println("1 is not present in the hashset");
        }

        //Delete:
        hs.remove(1);
        if(hs.contains(1)){
            System.out.println("1 is present in the hashset");
        }
        else{
            System.out.println("1 is not present in the hashset");
        }

        //Size
        System.out.println("Size of the hashset is: "+hs.size());

        //printing all elements of hashset
        System.out.println(hs);


        //Iterator:
        Iterator it=hs.iterator();
        //there are two function in iterator 1. hasNext 2. Next
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

=======
import java.util.HashSet;
import java.util.Iterator;
public class Hashset{
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        //Insert
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);


        //Search:
        if(hs.contains(1)){
            System.out.println("1 is present in the hashset");
        }
        else{
            System.out.println("1 is not present in the hashset");
        }

        //Delete:
        hs.remove(1);
        if(hs.contains(1)){
            System.out.println("1 is present in the hashset");
        }
        else{
            System.out.println("1 is not present in the hashset");
        }

        //Size
        System.out.println("Size of the hashset is: "+hs.size());

        //printing all elements of hashset
        System.out.println(hs);


        //Iterator:
        Iterator it=hs.iterator();
        //there are two function in iterator 1. hasNext 2. Next
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

>>>>>>> 5afb49b7f764467d742aa32d998845f948ae0aaf
}