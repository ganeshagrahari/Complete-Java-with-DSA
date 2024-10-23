import java.util.Scanner;

public class prac_fxn02 {
    public static void printName(String name){
        System.out.println(name);
    }
    public static int Sum(int a ,int b){
        return a+b;

    }
    public static void fac(int n){
        int fac=1;
        if(n<0){
            System.out.println("invalid input!!");
            return;

        }
        for(int i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
        return;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name:");
        String name=sc.next();
        printName(name);

        int x =4;
        int y=5;
        int u=Sum(x, y);
        System.out.println(u);
        fac(u);

    }
}
