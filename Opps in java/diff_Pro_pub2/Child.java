package diff_Pro_pub2;
import diff_Pro_pub.Parent;

public class Child extends Parent{
    void display(){
        System.out.println(protectedVar);//accessiable via inheritance
    }
}
