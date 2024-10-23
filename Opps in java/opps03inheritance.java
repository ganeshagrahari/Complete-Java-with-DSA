import java.util.*;//package of java
class Shape//base class ya parent class
{
    String color;
    public void area(){
        System.out.println("Displays Area!!");
    }

}
class Triangle extends Shape{//sub class

    public void area(int l,int h){
        System.out.println("Area is :"+(1/2)*l*h);
    }
}
class EquilateralTraingle extends Triangle{
    public void area(int l,int h){
        System.out.println("Area is :"+(1/2)*l*h);
    }
}
class Circle extends Shape{
    public void area(int r ){
        System.out.println((3.14)*r*r);
    }

}
public class opps03inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="red";
    }
}
