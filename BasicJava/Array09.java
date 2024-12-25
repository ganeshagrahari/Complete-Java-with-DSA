import java.util.*;
public class Array09 {
    public static void main(String[] args) {
        //Declaratiin of 2d array 
        /*int matrix [][]={{1,2,3},{4,5,6}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]+" ");

            }
            System.out.println();
        }*/

        //taking inputs from user :
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of row : ");
        int row =sc.nextInt();
        System.out.println("Enter number of Colums: ");
        int col=sc.nextInt();
        int arr [][]= new int [row][col];
        //take input from user :
        System.out.println("enter values for your matrix: ");
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("enter value for index : "+i+","+j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array's elements are :");
        //printing the value
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }

       


        // take a matrix from user and search for given number x and print their indices 
        /*Scanner sc = new Scanner(System.in);
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
        }*/

        

        
         
    }
}
