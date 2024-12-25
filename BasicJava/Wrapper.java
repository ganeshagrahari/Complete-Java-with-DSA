public class Wrapper {
    public static void main(String args[]){
        int num =100;
        //AutoBoxing: converting primitive data type to object
        Integer obj =num;
        System.out.println("Autoboxed value: "+obj);

        //Unboxing: converting object to primitive data type
        int value = obj;
        System.out.println("Unboxed value: "+value);
    }
    
}
