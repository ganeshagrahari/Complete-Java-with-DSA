class calculater{
    int add(int a,int b){
        return a+b;
    }
    double add(double a ,double b){
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        calculater c1= new calculater();
        //int result
        System.out.println(c1.add(1,2));
        //double result
        System.out.println(c1.add(1.5,5.6));
    }

    
}