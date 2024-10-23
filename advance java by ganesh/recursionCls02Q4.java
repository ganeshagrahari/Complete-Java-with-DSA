public class recursionCls02Q4 {
    //move all 'x' to the end of the string:---->"axbcxxd"-->abcdxxx
    public static void moveAllX(String str,int idx,int count, String newString){

        //base case:--->
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString +="x";//jitne time count hoga x utne time hi  
            }
            System.out.println(newString);
            return;
        }
        char currChar =str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
            
        }
        else{
            newString+=currChar;//newString =newString+currChar
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str, 0, 0, "");
    }
    

    
}
