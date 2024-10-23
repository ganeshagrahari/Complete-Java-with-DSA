public class recursionCls02Q5 {
    //Q5--->remove duplicates in a string:-->"abbccda"->"abcd"
    public static boolean [] map=new boolean[26];

    public static void removeDuplicates(String str, int idx,String newString){

        //Base  case-->
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar =str.charAt(idx);
        if(map[currentChar-'a']==true){//yaha pe == true hta bhi skte hai beacuse if there is nothing mentioned ...true is detained
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }


    public static void main(String[] args) {
        String str= "abbccda";
        removeDuplicates(str, 0, "");
        
    }
}