import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        
        // Close the scanner object
        scanner.close();
    }
}
