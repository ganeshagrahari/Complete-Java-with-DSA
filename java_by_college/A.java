class A {
    //protected int x; declares a protected integer variable x that can be accessed by the class itself and its subclasses.
    protected int x;

    A() {
        this.x = 0;
    }

    A(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }
}