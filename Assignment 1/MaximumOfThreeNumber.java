import java.util.Scanner;

public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the maximum of the three numbers
        int max = num1;  // Assume the first number is the maximum
        
        if (num2 > max) {
            max = num2;  // If second number is greater, update max
        }
        
        if (num3 > max) {
            max = num3;  // If third number is greater, update max
        }
        
        // Display the maximum number
        System.out.println("The maximum of the three numbers is: " + max);
        
        // Close the scanner object
        scanner.close();
    }
}
