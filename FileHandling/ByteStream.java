package FileHandling; // Ensure this matches your directory structure

import java.io.FileInputStream; // Import FileInputStream for reading bytes from a file
import java.io.FileOutputStream; // Import FileOutputStream for writing bytes to a file
import java.io.IOException; // Import IOException for handling input/output exceptions

public class ByteStream {
    public static void main(String args[]) {
        // Print the current working directory to help with debugging file paths
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        
        // Try-with-resources statement to ensure that the streams are closed automatically
        try (FileInputStream fis = new FileInputStream("FileHandling/input.txt");
             FileOutputStream fos = new FileOutputStream("FileHandling/output.txt")) {
            
            int data;
            // Read bytes from the input file one by one until the end of the file is reached
            while ((data = fis.read()) != -1) { // Read byte by byte
                fos.write(data); // Write byte by byte to the output file
            }
        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}