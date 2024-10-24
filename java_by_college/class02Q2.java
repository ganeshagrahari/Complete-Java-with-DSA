import java.util.Scanner;

public class class02Q2 {
    public static void main(String[] args) {
        //2->write a program in java input three numbers and find greatest amoung them:--->
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=sc.nextInt();
        System.out.println("enter second number :");
        int num2=sc.nextInt();
        System.out.println("enter third number: ");
        int num3=sc.nextInt();
        if (num1>num2 & num1>num3){
            System.out.println("the number 1, "+num1+" is biggest!");
        }
        else if( num2>num3){
            System.out.println("the number 2, "+num2+" is biggest!");

        }
        else{
            System.out.println("the number 3 ,"+num3+" is biggest!");

        }
        

    }
}
