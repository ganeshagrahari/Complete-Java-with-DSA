//1.write a program in java to create a abstract class for colculating parameter of a polygon impliment this class for at least 4 kinds of polygon e.g. triangle, rectangle, square,
//2.reate question no  using interface?


//Q1-
// Defining abstract class :
abstract class Polygon{
    abstract double CalcuPara();
}
class Triangle extends Polygon{
    private double a,b,c;
    public Triangle(double a, double b, double c){
        this.a =a ;
        this.b=b;
        this.c=c;
    }
    double CalcuPara(){
        return a+b+c;
    }
}
class Rectangle extends Polygon{
    private double L, H;
    public Rectangle(double L, double H){
        this.L =L;
        this.H=H;
    }
    double CalcuPara(){
        return 2*(L+H);
    }
}
class Square extends Polygon{
    private double side;
    public Square(double side){
        this.side =side ;   
    }
    double CalcuPara(){
        return 4*side;
    }

}
public class abstractClass_11_11_test {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        Rectangle r = new Rectangle(3,4);
        Square s = new Square(4);
        System.out.println("Parameter of Triangle : "+t.CalcuPara());
        System.out.println("Parameter of Rectangle : "+r.CalcuPara());
        System.out.println("Parameter of Square : "+s.CalcuPara());
    }
}
