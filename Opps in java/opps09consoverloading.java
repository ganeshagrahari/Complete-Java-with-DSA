class Informatio {
    int num;
    String name;

    // Default constructor
    Informatio() {
        this.num = 0;
        this.name = "Default";
        System.out.println("Default constructor called, num = " + num + ", name = " + name);
    }

    // Parameterized constructor with one parameter 
    Informatio(int num) {
        this.num = num;
        this.name = "Unknown";
        System.out.println("Parameterized constructor called with one parameter, num = " + num + ", name = " + name);
    }

    // Parameterized constructor with two parameters
    Informatio(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("Parameterized constructor called with two parameters, num = " + num + ", name = " + name);
    }

    // Method to display object details
    void display() {
        System.out.println("Informatio object - num: " + num + ", name: " + name);
    }
}

public class opps09consoverloading {
    public static void main(String[] args) {
        // Creating objects using constructor overloading
        Informatio info1 = new Informatio();         // Calls default constructor
        Informatio info2 = new Informatio(10);       // Calls constructor with one parameter
        Informatio info3 = new Informatio(20, "John"); // Calls constructor with two parameters

        // Use the objects to remove the warning
        info1.display();
        info2.display();
        info3.display();
    }
}
