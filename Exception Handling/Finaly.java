public class Finaly {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
