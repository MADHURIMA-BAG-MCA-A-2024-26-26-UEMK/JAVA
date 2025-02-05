class Person {
    String name;
    int age;

    // Constructor 1 (no parameters)
    public Person() {
        this("Unknown", 25); // Calling another constructor with two parameters
    }

    // Constructor 2 (with parameters)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Man {
    public static void main(String[] args) {
        Person person1 = new Person(); // Calls constructor with no parameters
        Person person2 = new Person("Alice", 30); // Calls constructor with parameters

        person1.display();
        person2.display();
    }
}
