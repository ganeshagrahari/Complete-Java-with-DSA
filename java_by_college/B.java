class B extends A {
    protected int y;

    B() {
        super();
        this.y = 0;
    }

    B(int y) {
        super();
        this.y = y;
    }
    B(int x, int y) {
        super(x);
        this.y = y; // Fixed syntax error (missing semicolon)
    }

    int gety() {
        return this.y;
    }

    void sety(int y) { // Changed method to take a parameter
        this.y = y;
    }
    final void fn(){
        System.out.println("Hello, World! From class B");

    }

    public static void main(String[] args) {
        B b = new B(10, 5);
        System.out.println(b.getX()); // Corrected to call on instance
        System.out.println(b.gety()); // Corrected to call on instance
    }
}