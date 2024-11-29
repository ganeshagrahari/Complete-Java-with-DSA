package FileHandling;
import java.io.*;

public class CharactorStream {
    public static void main(String args []){
        System.out.println("Byte Stream Example success");
        try(FileReader fr =new FileReader("FileHandling/input.txt");
            FileWriter fw = new FileWriter("FileHandling/output.txt")){
                int data;
                while ((data =fr.read())!=-1){// Read character by character
                    fw.write(data); //Write character by character to the output file
                }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    
}
}
