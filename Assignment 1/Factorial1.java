public class Factorial1 {
    
    // Method to calculate the factorial
    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply the current factorial value by i
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Check if the user has provided an input
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;  // Exit the program if no input is provided
        }
        
        // Parse the input from the command line argument
        int num = Integer.parseInt(args[0]);
        
        // Check if the number is negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        
        // Call the calculateFactorial method and store the result
        long result = calculateFactorial(num);
        
        // Display the result
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
