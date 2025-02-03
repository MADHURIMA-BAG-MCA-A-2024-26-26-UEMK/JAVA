public import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Display the input values
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
 {
    
}
