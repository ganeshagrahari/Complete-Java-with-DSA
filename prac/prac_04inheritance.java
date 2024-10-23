class shape{
    String color;
    public static void area(){
        System.out.println("Displays Area!!");
    }
}

class Triangle extends shape{
    public static void area(int l ,int h){
        System.out.println("the area of triangle is:"+0.5*l*h);
    }
}
public class prac_04inheritance {
    public static void main (String [] args){
        Triangle t1=new Triangle();
        t1.color="red";
        t1.area();

        t1.area(2, 7);


    }
}
