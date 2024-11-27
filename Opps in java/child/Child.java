package child;
import parent.Parent;

public class Child extends Parent{
    void display(){
       // System.out.println(privatevar);//not accessiable because it is private
        //System.out.println(defaultvar);//not accesssible beacuse it is in different package
        System.out.println(protectedvar);//accessiable via inheritance
        System.out.println(publicvar);// Accessiable
    }
    public static void main(String[] args) {
        Child ch=new Child();
        ch.display();
        
    }
    
}
