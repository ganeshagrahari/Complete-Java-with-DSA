package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {

        // code to create a new file
        /*
         * File myfile= new
         * File("C:\\Users\\ganes\\OneDrive\\Desktop\\Complete java by  ganesh\\FileHandling\\myfile.txt"
         * );
         * try {
         * myfile.createNewFile();
         * } catch (IOException e) {
         * // TODO Auto-generated catch block
         * System.out.println("Unable to create this file!");
         * e.printStackTrace();
         * }
         
        // code to write in a file
        try {
            FileWriter fw = new FileWriter(
                    "C:\\Users\\ganes\\OneDrive\\Desktop\\Complete java by  ganesh\\FileHandling\\myfile.txt");
            fw.write("this is my first file from my java jounery\n ok now bye!");
            fw.close();
        } catch (IOException e) {
            System.out.println("Unable to write in this file!");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Reading a file
        File myfile = new File(
                "C:\\Users\\ganes\\OneDrive\\Desktop\\Complete java by  ganesh\\FileHandling\\myfile.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String data =sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read this file!");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  */
          
        // deleting a file
        File myfile =new File("C:\\Users\\ganes\\OneDrive\\Desktop\\Complete java by  ganesh\\FileHandling\\del.txt");
        if(myfile.delete()){
            System.out.println("File deleted successfully!" +myfile.getName());
        }
        else{
            System.out.println("Unable to delete this file!"+myfile.getName());
        }

    }

}
