class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using method overloading
        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(1, 2, 3));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
        System.out.println("Sum of integer and double: " + calculator.add(5, 10.5));
    }
}
