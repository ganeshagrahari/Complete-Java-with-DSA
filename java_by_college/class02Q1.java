import java.util.Scanner;

public class class02Q1 {
    public static void main(String[] args) {
        //1->write a program jin java to get a number from a user and print if it is +ive or -ive number?
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("the given number : "+num+ "is positive");

        }
        else{
            System.out.println("the given number is "+ num + " is negative!!");
        }
    }
}
