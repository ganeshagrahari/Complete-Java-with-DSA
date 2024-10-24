import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n =sc.nextInt();
        int sum=0;
        System.out.println("these numbers are: --");
        for(int i=1;i<=n;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("the sum of given number is: "+sum);
    }
}
