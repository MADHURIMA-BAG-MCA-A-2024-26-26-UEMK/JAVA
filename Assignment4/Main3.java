class Example {
    public void displayMessage() {
        System.out.println("This is the displayMessage method.");
    }

    public void invokeDisplay() {
        this.displayMessage(); // Invoking current class method using 'this'
    }
}

public class Main3 {
    public static void main(String[] args) {
        Example example = new Example();
        example.invokeDisplay(); // Will call invokeDisplay, which internally calls displayMessage
    }
}

