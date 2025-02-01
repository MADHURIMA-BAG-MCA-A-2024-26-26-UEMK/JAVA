public class Person {

    // Instance variables
    String name;
    int age;

    // Default constructor (no arguments)
    public Person() {
        // Initializing the instance variables with default values
        name = "Unknown";
        age = 0;
    }

    // Method to display the values
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person using the default constructor
        Person person = new Person();

        // Displaying the values using the displayInfo method
        person.displayInfo();
    }
}
