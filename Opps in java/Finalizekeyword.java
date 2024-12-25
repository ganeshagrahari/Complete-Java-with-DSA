class Demo{
    protected void finalize(){
        System.out.println("Object is garbage collected");
    }

}
public class Finalizekeyword {
    public static void main(String[] args) {
        Demo obj =new Demo();
        obj=null;//making obj eligible for garbage collection
        System.gc();//calling garbage collector
    }
}
