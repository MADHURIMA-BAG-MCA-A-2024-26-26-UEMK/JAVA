class Car {
    String model;
    int year;

    // Constructor with no parameters
    public Car() {
        this.model = "Unknown";
        this.year = 2020;
    }

    // Constructor with one parameter
    public Car(String model) {
        this.model = model;
        this.year = 2020;
    }

    // Constructor with two parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls constructor with no parameters
        Car car2 = new Car("Toyota"); // Calls constructor with one parameter
        Car car3 = new Car("Honda", 2021); // Calls constructor with two parameters

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}

