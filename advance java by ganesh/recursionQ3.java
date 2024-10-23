//find factorial of given number:---->

public class recursionQ3 {
    public static int calcFatorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calcFatorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
       int ans = calcFatorial(n);
       System.out.println(ans);
        
    }
}
