import java.util.Scanner;

public class if_else02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //enter a.
        System.out.println("enter ur a: ");
        int a = sc.nextInt();
        //enter b.
        System.out.println("enter ur b: ");
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("a is eqaual to b!");
            
        }
        
        else if(a>b){
                System.out.println("a is greater than b!");
        }
        else{
                System.out.println("a is lesser than b!");
        }
        
        
        
    }
}
