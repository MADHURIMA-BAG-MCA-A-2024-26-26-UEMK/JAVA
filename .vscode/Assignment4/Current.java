class Example {
    public void display(Example obj) {
        System.out.println("Displaying from the passed object: " + obj);
    }

    public void callDisplay() {
        this.display(this); // Passing current class object to the method
    }
}

public class Current {
    public static void main(String[] args) {
        Example example = new Example();
        example.callDisplay(); // Will pass the current object to the display method
    }
}

