class student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("the name of student is "+ name);
    }
    public void printInfo(int age){
        System.out.println("the age of student is "+ age);
    }
    public static void printInfo(String name,int age){
        System.out.println("the name of student is "+name+" and the age of student is "+age );
    }
}
public class parac_04poly {
    public static void main (String [] args){
        student s1=new student();
        s1.name="ganesh";
        s1.age=20;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);

        


    }
}
