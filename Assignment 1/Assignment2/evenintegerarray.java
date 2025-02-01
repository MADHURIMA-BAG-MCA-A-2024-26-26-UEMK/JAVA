public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = {10, 15, 20, 25, 30, 35, 40};

        // Variable to store the sum of even numbers
        int sum = 0;

        // Loop through the array to check for even numbers
        for (int num : numbers) {
            // Check if the number is even
            if (num % 2 == 0) {
                sum += num; // Add the even number to sum
            }
        }

        // Print the sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }
}
