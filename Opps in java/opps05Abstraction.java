// Define an abstract class named Animal
abstract class Animal {
    // Abstract method walk, which must be implemented by subclasses
    abstract void walk();

    // Concrete method eat, which can be used by all subclasses
    public void eat() {
        System.out.println("Animal eats!");
    }

    // Constructor for Animal class
    Animal() {
        System.out.println("You are creating a new animal!");
    }
}

// Define a subclass of Animal named Horse
class Horse extends Animal {
    // Constructor for Horse class
    Horse() {
        System.out.println("Created a horse!");
    }

    // Implementation of the abstract method walk
    public void walk() {
        System.out.println("Walks on four legs!");
    }
}

// Define another subclass of Animal named Chicken
class Chicken extends Animal {
    // Implementation of the abstract method walk
    public void walk() {
        System.out.println("Walks on two legs!!");
    }
}

// Main class to test the functionality
public class opps05Abstraction {
    public static void main(String[] args) {
        // Create an instance of Horse and chicken 

        Horse horse = new Horse();
        Chicken chicken =new Chicken();
        // Call the walk method on the Horse instance
        horse.walk();
        chicken.walk();
        // Call the eat method on the Horse instance
        horse.eat();
        chicken.eat();
        //Call the 
    }
}