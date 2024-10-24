import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        System.out.println("enter a year: ");
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
