class try_catch {
    public static void main(String[] args) {
        System.out.println("Main method started :");
        int a = 10, b = 0, c;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}