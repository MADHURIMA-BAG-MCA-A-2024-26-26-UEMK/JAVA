class Student {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;  // Initializing instance variable 'name'
        this.age = age;    // Initializing instance variable 'age'
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Student using the parameterized constructor
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Alice", 22);

        // Display information of both students
        student1.displayInfo();
        student2.displayInfo();
    }
}

