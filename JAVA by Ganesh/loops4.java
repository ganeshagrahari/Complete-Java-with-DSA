import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {

        //For loop
        /*for(int i=0;i<100;i++){
            System.out.println("hello");
        }*/
        /*for(int i=0;i<100;i++){
            System.out.println(i);
        }*/

        // While loop:----->
        /*int i =0;
        while(i<10){
            System.out.println(i);
            i++;
        }*/

        //Do while loop:------>
        
        /*int i=12;
        do{
            System.out.println("Ganesh");
            i++;
        }
        while(i<11);
    }*/



    // print the sum of n natural number :------>
   /*  Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of n:");
    int n =sc.nextInt();
    int sum=0;
    for(int i=0;i<=n;i++){
        sum=sum+i;
    }
    System.out.println("the sum of n natural number is : "+sum);*/
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number for your table :");
    int n =sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(i*n);
        
    }
 
    
}
}
