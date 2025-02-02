//import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;

public class BufferedReader {
    public static void main(String[] args) {
        // Creating a BufferedReader to read from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompting user for input
            System.out.print("Enter your name: ");
            String name = reader.readLine();  // Reads a line of text

            // Prompting user for another input
            System.out.print("Enter your age: ");
            String ageString = reader.readLine();  // Reads the next line of text
            
            // Converting the age input to an integer
            int age = Integer.parseInt(ageString);

            // Displaying the results
            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");

        } catch (IOException e) {
            // Handle potential IOException
            System.out.println("An error occurred while reading input.");
        } finally {
            try {
                // Close the BufferedReader to release resources
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }
    }
}
