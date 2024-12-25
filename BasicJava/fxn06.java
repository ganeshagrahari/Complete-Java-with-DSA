import java.util.Scanner;

public class fxn06 {
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter ur your name :");
        String name= sc.next();

        printMyName(name);
        
    }*/
    /*public static int  printSum (int a , int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        

        int sum =printSum(a, b);
       
        System.out.println("the sum of a and b is : "+sum);
        
    }*/

    /*public static int  printMul (int a , int b) {
       
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        

        
       
        System.out.println("the multiply of a and b is : "+ printMul(a, b));
        
    }*/
    public static void  printFactorial (int n) {
        int factorial = 1;

        if(n<0){
            System.out.println("invalid input!!!");
            return;
        }
       
        //loop
        for(int i=n;i>=1;i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();

      printFactorial(n);
        
        

        

        
    }
}

