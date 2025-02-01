public class Person {

    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;  // 'this' refers to the current object's instance variable
        this.age = age;
    }

    // Method to display the values
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person using the parameterized constructor
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Displaying the values using the displayInfo method
        person1.displayInfo();
        person2.displayInfo();
    }
}
