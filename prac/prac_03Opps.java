class pen{
    String color;
    String type;
    static String brand;// same for all
    public void write(){
        System.out.println("Writing somthing!!");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class student{
    String name;
    int rollno;

    public void printInfo(){//ye non parameter wla hai
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

    /*student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;

    }*/

    student(student s2){//copy constructor
        this.name=s2.name;
        this.rollno=s2.rollno;

    }
    student(){

    }
}
public class prac_03Opps {
    public static void main(String [] args){
        pen.brand="luxor";// this will same for all pens

        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="Ball";

        pen pen2=new pen();
        pen2.color="red";
        pen2.type="Gel";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        student s1=new student();
        s1.name="ganesh";
        s1.rollno=1230258176;

        s1.printInfo();

        student s2=new student(s1);
        s2.printInfo();


    }
}
