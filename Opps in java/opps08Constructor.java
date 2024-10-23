/*class Car{
    int prize;

    Car(){
        //Default constructor
        prize=1000;
        System.out.println("Default called the prize of car is:"+prize);
    }
}*/
class Example{
    int num;

    Example(int num){
        this.num=num;
    }
    void display(){
        System.out.println("The value of num is: "+num);
    }
}
public class opps08Constructor {
    public static void main(String [] args){
        Example e=new Example(10);
        e.display();
    



    }
}
