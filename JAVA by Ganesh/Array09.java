import java.util.*;
public class Array09 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("enter number of columns : ");
        int col = sc.nextInt();

        int[][] numbers=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.println("Elements of 2D arrays are: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(numbers[i][j]);
            }
        }*/


        // take a matrix from user and search for given number x and print their indices 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("enter number of columns : ");
        int col = sc.nextInt();

        int[][] numbers=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter elements for index : "+ i+","+j);
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.print("enter the number r u searching for : ");
        int x =sc.nextInt();

        System.out.println("Elements of 2D arrays are: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.println("---> x found at index "+ i+","+j);
                }
            }
        }

        
         
    }
}
