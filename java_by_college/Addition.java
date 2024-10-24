import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Addition {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the first number:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter the second number:");
            int b = Integer.parseInt(br.readLine());
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}

