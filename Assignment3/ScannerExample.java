import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the keyboard
        Scanner sc = new Scanner(System.in);
        
        // Read a string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Read an integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        // Display the inputs
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
        
        // Close the scanner to free up resources
        sc.close();
    }
}

