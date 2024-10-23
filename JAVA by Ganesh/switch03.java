import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter button:
        System.out.println("Press 1 for hello ,2 for Namste , 3 for bonjur : ");
        int button = sc.nextInt();
       

       /*  if (button==1) {
            System.out.println("Hello!");
            
        }
        
        else if(button==2){
                System.out.println("Namaste!");
        }
        else if(button==3){
                System.out.println("Bonjur!");
        }
        else{
                System.out.println("Invalid input XXX");
        }*/
        switch(button){
            case 1: System.out.println("Hello!!");
            break;
            case 2: System.out.println("Namaste !!");
            break;
            case 3: System.out.println("Bonjur!!");
            break;
            default: System.out.println("invalid input XXX");

            


        }
    }
    
}
