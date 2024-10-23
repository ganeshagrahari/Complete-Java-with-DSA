import javax.print.DocFlavor.STRING;

class Pen{
    String color;
    String type;// ballpoint,gel etc
    static String brand;
    public void write(){
        System.out.println("writing somthing");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public static void changebrand(){
        brand="new";
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*Student(String name,int age){//-->Non parameter me parameters nhi hote hai
        this.name=name;
        this.age=age;
    }*/
    Student(Student s2){//copy constructor
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
}
public class opps01 {
    public static void main(String [] args){
        Pen.brand="A";
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="Black";
        pen2.type="ballpoint";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        Student s1= new Student();//new -> head me nyi memory ban jaygi and object ko memory allocate ho jagyi..and ()->special type function called constructor
        s1.name="Ganesh Agrahari";
        s1.age=19;
        s1.printInfo();
       
       // Student s1=new Student("Ganesh", 19);

       Student s2=new Student(s1);
        s2.printInfo();
    }

    
}