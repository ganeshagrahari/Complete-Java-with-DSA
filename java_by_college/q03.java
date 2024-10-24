import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int[] num= new int[8];
        int sum=0;
        System.out.println("enter number:--");
        
        for(int i=1;i<=5;i++){
            num[i]=sc.nextInt();
            sum=sum+num[i];     
            
        }
        double avg=sum/5;
        System.out.println("the sum is :" +sum);
        System.out.println("the avg is :"+avg);
       

        
        
        

       
        

    }
}
