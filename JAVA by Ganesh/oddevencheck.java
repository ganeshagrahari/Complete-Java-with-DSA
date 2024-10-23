import java.util.Scanner;

public class oddevencheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter no.
        System.out.println("enter ur number: ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Number is even!");
            
        }
        else{
            System.out.println("number is odd!");
        }
    }
}
