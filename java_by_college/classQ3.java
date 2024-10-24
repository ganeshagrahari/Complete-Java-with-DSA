import java.util.Scanner;

public class classQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=sc.nextInt();
        System.out.println("enter second number :");
        int num2=sc.nextInt();
        System.out.println("enter third number: ");
        int num3=sc.nextInt();
        System.out.println("enter forth number: ");
        int num4=sc.nextInt();
        int A,B;
        if(num1>num2){
            A=num1;
        }
        else{
            A=num2;
        }
        if(num3>num4){
            B=num3;
        }
        else{
            B=num4;
        }



        if(A>B){
            System.out.println("the number "+A+" is biggest!");
        }
        else{
            System.out.println("the number "+B+" is biggest!");
        }


    }

}
