public class TwoDArrayExample {
    public static void main(String[] args) {
        // Creating a 2D array with 3 rows and 3 columns
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing and printing elements of the 2D array
        System.out.println("Element at row 0, column 0: " + matrix[0][0]);
        System.out.println("Element at row 0, column 1: " + matrix[0][1]);
        System.out.println("Element at row 0, column 2: " + matrix[0][2]);

        System.out.println("Element at row 1, column 0: " + matrix[1][0]);
        System.out.println("Element at row 1, column 1: " + matrix[1][1]);
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);

        System.out.println("Element at row 2, column 0: " + matrix[2][0]);
        System.out.println("Element at row 2, column 1: " + matrix[2][1]);
        System.out.println("Element at row 2, column 2: " + matrix[2][2]);
    }
}
