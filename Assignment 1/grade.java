import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the total marks and marks obtained
        System.out.print("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();
        
        System.out.print("Enter the marks obtained: ");
        double obtainedMarks = scanner.nextDouble();
        
        // Calculate the percentage
        double percentage = (obtainedMarks / totalMarks) * 100;
        
        // Display the percentage
        System.out.println("Percentage: " + percentage + "%");
        
        // Determine the grade based on the percentage
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        
        // Close the scanner object
        scanner.close();
    }
}
