import java.util.Scanner;

public class Arrays08 {
    public static void main(String[] args) {
      //type [] arrayName=new type [size];
     /*  int[] marks= new int[3];
      //int marks[]= new int[3]; also a valid syntax.....
      marks[0]=97;  
      marks[1]=98;  
      marks[2]=99;
      System.out.println(marks[0]);  
      System.out.println(marks[1]);  
      System.out.println(marks[2]);  

      for(int i=0;i<3;i++){
        System.out.println(marks[i]);

      }*/

      /*Scanner sc = new Scanner(System.in);
      System.out.println("enter size: ");
      int size= sc.nextInt();
      int numbers[]=new int[size];

      for(int i =0;i<size;i++){
    
        System.out.println("enter elment for index no. : "+i);
        numbers[i]=sc.nextInt();
      }
      System.out.println("elements of arrays are: ");

      for(int i=0;i<size;i++){
        System.out.println(numbers[i]);
      }*/


      // Question:---- take an array from user and search for a given number x and index at which it occurs ..
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size: ");
      int size= sc.nextInt();
      int numbers[]=new int[size];

      for(int i =0;i<size;i++){
    
        System.out.println("enter elment for index no. : "+i);
        numbers[i]=sc.nextInt();
    }
    System.out.println("enter the value what are u searching for : ");
    int x =sc.nextInt();

    //size for array ==== numbers(name of array).length
    for(int i =0;i<numbers.length;i++){
        if(numbers[i]==x){
            System.out.println("----> x found at index : "+i);
        }
    }


    // this is linear search ................

    }
}
