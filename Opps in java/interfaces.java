import java.util.Scanner;

interface client {
    void input();// by default public and abstract
    void output();
}
class ganesh implements client{
    String Name; double salary;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name :");
        Name =sc.nextLine();

        System.out.println("Enter salary :");
        salary =sc.nextDouble();
    }
    public void output(){
        System.out.println("Name :"+Name);
        System.out.println("Salary :"+salary);
    }
    
}
public class interfaces {

    public static void main(String[] args) {
        client c =new ganesh();
        c.input();
        c.output();
    }  
}
