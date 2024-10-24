class C extends B {
    private int z; // Specify the type for z

    C() {
        this.z = 0;
    }

    C(int z) {
        super.y = -1; // Assuming y is accessible and has been declared in class B
        super.x = -1; // Assuming x is accessible and has been declared in class A
        this.z = z;
    }

    C(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    int getz() {
        return this.z;
    }

    void Setz() {
        this.z = 0; // Removed the return statement as it's a void method
    }

    //because we use final method in previous class.
    /*void fn(){
        System.out.println("Hello, World! From class C");

    } */
    void demoAbs(){}

    public static void main(String[] args) {
        C c = new C(1);
        System.out.println(c.getX()); // Assuming getX() is defined in B or A
        System.out.println(c.gety()); // Assuming gety() is defined in B
        System.out.println(c.getz()); // This should work now
        c.fn();
    }
}