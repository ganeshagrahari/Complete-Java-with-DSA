class vimro{
    static int square(int x){
        return x*x;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(vimro.square(5));
    }
}
