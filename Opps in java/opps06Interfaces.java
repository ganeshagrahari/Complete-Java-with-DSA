interface Animal {
    void walk();
    //we can't create a constructor in interfaces 
}
interface Herbivore {
   
    
}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on four legs!");
    }
}
public class opps06Interfaces {
    public static void main(String[] args) {
        Horse horse =new Horse();
        horse.walk();  
        
    }
}
