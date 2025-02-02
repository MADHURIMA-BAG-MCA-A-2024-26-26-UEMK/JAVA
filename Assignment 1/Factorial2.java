public class Factorial2 {
    
    // Method to calculate the factorial
    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply the current factorial value by i
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Declare a variable
        int num = 5; // You can change this value to calculate the factorial of another number
        
        // Call the calculateFactorial method and store the result
        long result = calculateFactorial(num);
        
        // Display the result
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
