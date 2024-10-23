import java.util.HashSet;

public class recursionCls02Q6 {
    //print all the subsequences of a string:--->"abc"--->
    public static void subsequences(String str, int idx, String newString,HashSet<String> set){

        //base case:->
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
          
        }


        
        char currentChar=str.charAt(idx);

        
        // to be 
        subsequences(str, idx+1, newString+currentChar,set);


        //or not be
        subsequences(str, idx+1, newString,set);
    }

    public static void main(String[] args) {
        String str="abc";
        HashSet<String> set=new HashSet<>();
        subsequences(str, 0, "",set);
        
    }
}
