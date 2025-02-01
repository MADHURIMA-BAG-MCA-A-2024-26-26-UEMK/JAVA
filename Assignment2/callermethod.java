public class SumCalculator {

    // Method to calculate the sum of two numbers
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;  // Perform addition
        return sum;  // Return the sum to the caller
    }

    public static void main(String[] args) {
        int number1 = 10;  // First number
        int number2 = 20;  // Second number
        
        // Call the calculateSum method and store the result in sumResult
        int sumResult = calculateSum(number1, number2);
        
        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sumResult);
    }
}
