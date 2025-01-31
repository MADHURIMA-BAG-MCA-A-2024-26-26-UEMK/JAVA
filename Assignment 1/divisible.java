import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is divisible by 5
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
        
        // Close the scanner object
        scanner.close();
    }
}
