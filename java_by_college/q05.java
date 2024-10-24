import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        System.out.println("enter the nummber for table :---");
        Scanner sc=new Scanner(System.in);
        int mul=sc.nextInt();
        System.out.println("the table is :");
        for(int i=1;i<=10;i++){
            System.out.println(mul *i);
        }
    }
}
