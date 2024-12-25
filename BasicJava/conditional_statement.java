import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //inter your age:-
        System.out.println("Enter your age: ");
        int age = sc.nextInt();  

        if (age>=18) {
            System.out.println("You are eligible!");
            
        }
        else{
            System.out.println("you are not eligible");
        }

        
    }
}
