class Example {
    int x;  // Instance variable

    public Example(int x) {
        this.x = x;  // Referring to the current class instance variable using 'this'
    }

    public void display() {
        System.out.println("Instance variable x: " + this.x);  // Accessing instance variable
    }
}

public class Main8 {
    public static void main(String[] args) {
        Example example = new Example(100);
        example.display();  // This will print the instance variable 'x'
    }
}

