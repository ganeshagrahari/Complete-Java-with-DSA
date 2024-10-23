class calculator{
    //Instance method:-
    int add(int a,int b){
        return a+b;
    }
    static int mul(int a, int b){
        return a*b;
    }
}
public class opps07 {
    public static void main(String[] args) {
        calculator cal=new calculator();
        int sum=cal.add(5, 7);
        System.out.println(sum);

        int multiply=calculator.mul(5,7);
        System.out.println(multiply);

        
    }
    
}
