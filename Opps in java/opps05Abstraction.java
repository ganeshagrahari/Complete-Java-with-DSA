abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats!");
    }
    Animal(){
        System.out.println("You are creating a new animal!");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse!");
    }
    public void walk(){
        System.out.println("Walks on four legs!");
    }
}
class chicken extends Animal{
    
    public void walk(){
        System.out.println("walks on two legs!!");
    }
}
public class opps05Abstraction {
    public static void main(String[] args) {
        Horse horse= new Horse();
        horse.walk();
        horse.eat();
        
        
    }
}
