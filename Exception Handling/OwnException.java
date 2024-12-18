public class OwnException {
    //Creating a custom exception
    static class MyException extends Exception {
        public MyException(String s) {
            super(s);
        }
    }
    public static void main(String[] args) {
        try {
            throw new MyException("This is my exception");
        } catch (MyException e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
