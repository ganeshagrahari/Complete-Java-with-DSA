public class recusionCls02Q3 {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return  true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
           return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        //check the number is sorted or not:----->{1,2,3,4,5}(strictli increasing )
        int arr[]={1,3,3};
        System.out.println(isSorted(arr, 0));


    }
}
