class Example {
    public Example getInstance() {
        return this;  // Return the current class instance
    }

    public void display() {
        System.out.println("This is the current instance.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Example example = new Example();
        example.getInstance().display();  // Calling method using the returned instance
    }
}


