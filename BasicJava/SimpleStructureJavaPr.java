//Package declaration 
//BasicJava; //Package name
//Importing the required packages
import java.util.Scanner;
public class SimpleStructureJavaPr { //Class declaration
    public static void main(String[] args) {//Main method declaration
        System.out.println("Enter your name : "); //Printing the message
        Scanner sc = new Scanner (System.in); //Creating object for Scanner class
        String name =sc.nextLine(); //Reading the input from user
        System.out.println("welcome "+name+"!"); //Printing the message;
        sc.close(); //Closing the scanner object
    }
}