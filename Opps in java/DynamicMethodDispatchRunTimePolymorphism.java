class animal{
    void sound(){
        System.out.println("Animal makes a sound!");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog barks!!");
    }
}
class cat extends animal {
    @Override
    void sound(){
        System.out.println("Cat meows!!");
    }
}
public class DynamicMethodDispatchRunTimePolymorphism {

    public static void main(String [] agrs){
        animal Animal;

        //dog instance
        animal Dog =new dog();
        //cat instance
        animal Cat =new cat();

        //dog sound!!
        Dog.sound();

        //cat sound
        Cat.sound();




    }
}