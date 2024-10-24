import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        System.out.println("enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum =0;
        System.out.println("the odd numbers of this series is : ");
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
                sum=sum+i;

            }

        }
        System.out.println("the sum of n odd numbers is : "+ sum);
    }
    
}
