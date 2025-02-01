public class DiagonalSum {
    public static void main(String[] args) {
        // Initialize a 2D array (square matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Variable to store the sum of diagonal elements
        int diagonalSum = 0;

        // Length of the matrix (assuming it's a square matrix)
        int n = matrix.length;

        // Loop through the matrix to find diagonal elements
        for (int i = 0; i < n; i++) {
            // Primary diagonal: matrix[i][i]
            diagonalSum += matrix[i][i];

            // Secondary diagonal: matrix[i][n - i - 1]
            if (i != n - i - 1) {  // Avoid adding the center element twice if it's the same
                diagonalSum += matrix[i][n - i - 1];
            }
        }

        // Print the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
