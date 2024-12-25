import java.util.Scanner;

public class string10 {
    public static void main(String[] args) {
        // string declaration 
        /*String name="ganesh";
        String fullname = "ganesh agrahari";
        String sentence="my name is Ganesh Agrahari";*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        System.out.println("your name is : "+name );*/

        //Concatenation

        /*String FirstName = "Ganesh";
        String LastName = "Agrahari";
        String fullname= FirstName +" "+  LastName;
        System.out.println(fullname);
        System.out.println(fullname.length());*/


        //charAt

        /*for(int i =0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }*/

        /*String name1= "Ganesh";
        String name2="Ganesh";*/

        //1 s1> s2 : +ve value
        //2 s1< s2 : -ve value
        //3 s1==s2 : 0

        //campare to fxn:----->
        /*if(name1.compareTo(name2)==0){

            System.out.println("Strings are equal!!");
        }
        else{
            System.out.println("Strings are not equal!!");
        }*/

        //normal == using :------->
        /*if(name1.compareTo(name2)==0){

            System.out.println("Strings are equal!!");
        }
        else{
            System.out.println("Strings are not equal!!");
        }*/

        //camparing new strings :------------->

        /*if(new String("Ganesh")==new String("Ganesh")){

            System.out.println("Strings are equal!!");
        }
        else{
            System.out.println("Strings are not equal!!");
        }*/


        String sentence= "Ganesh";
        //substring(beg index, end index)
        String name = sentence.substring(0,4);
        System.out.println(name);




    }
}
