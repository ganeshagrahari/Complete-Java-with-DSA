import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
         //Country, Population
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        //Insert
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("USA", 30);
        

        System.out.println(hm);
        hm.put("India", 140);
        System.out.println(hm);

        //Search 
        if(hm.containsKey("India")){
            System.out.println("India is present in the hashmap");
        }
        else{
            System.out.println("India is not present in the hashmap");
        }

        //get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Pakistan"));

        /*int arr[]={12,15,18};
        //method-1:
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //method-2:
        for(int val : arr){
            System.out.print(val +" ");

        }
        System.out.println();*/

        //iteration in hashmap:
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println("Country: " + e.getKey() + ", Population: " + e.getValue());
        }

        //Remove
        hm.remove("USA");
        System.out.println(hm);

       
    }

        
    }
    

