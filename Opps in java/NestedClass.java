class Outer{
    int Outerfield =10;
    //inner class
    class Inner{
        void display(){
            System.out.println("Outer Field:"+Outerfield);
        }
    }
}
public class NestedClass {
    public static void main(String args[]){
        Outer outer =new Outer();
        Outer.Inner inner =outer.new Inner();
        inner.display();

    }
    
}
