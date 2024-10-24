class Program {
    String name; // Instance variable for storing the name
    long phone;  // Instance variable for storing the phone number

    // Default constructor
    Program() {
        this.name = null; // Initialize name to null
        this.phone = 0;   // Initialize phone to 0
    }

    // Constructor that accepts name and phone number
    Program(String name, long phone) {
        this(phone); // Calling the constructor that takes a phone number
        this.name = name; // Set the name
        // this.phone=phone; // This line is commented out; it's not needed
    }

    
    // Constructor that accepts only the phone number
    Program(long phone) {
        this.phone = phone; // Set the phone number
    }

    // Method to return the current object
    Program getObject() {
        return this; // Return the current instance of the class
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Program ob = new Program(900454548); // Create an instance using the constructor with phone
        System.out.println(ob.name); // Print the name (null)
        System.out.println(ob.phone); // Print the phone (900454548)

        Program ob1 = ob.getObject(); // Get the current object reference
        if (ob1 == ob) { // Check if ob1 is the same object as ob
            System.out.println("Same object !!!"); // Print if they are the same
        }
        System.out.println(ob); // Print the object reference
        System.out.println(ob); // Print the object reference again
    }
}