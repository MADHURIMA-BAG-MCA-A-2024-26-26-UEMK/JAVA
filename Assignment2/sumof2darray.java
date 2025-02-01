public class SumOf2DArray {
    public static void main(String[] args) {
        // Define and initialize two 2D arrays
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Declare a 2D array to store the sum
        int[][] sumArray = new int[3][3];

        // Loop through the arrays and add corresponding elements
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Print the result (sum of two 2D arrays)
        System.out.println("Sum of the two 2D arrays:");
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
