public class Factorial {
    public static void main(String[] args) {
        // Declare a variable
        int num = 5; // You can change this value to calculate the factorial of another number
        
        // Declare a variable to store the factorial result
        long factorial = 1;
        
        // Calculate the factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply the current factorial value by i
        }
        
        // Display the result
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
