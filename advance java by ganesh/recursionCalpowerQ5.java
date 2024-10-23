//Q5--->cal x^n stack height=n
public class recursionCalpowerQ5 {
    public static int calPower(int x,int n){
        //base cases-->
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        //work-->
        int Xpownm1=calPower(x, n-1);
        int xpown=x*Xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans =calPower(x, n);
        System.out.println(ans);
        
    }
}
