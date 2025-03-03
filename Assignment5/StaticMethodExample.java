class StaticMethodExample {
    static void displayMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Directly calling the static method without creating an object
        StaticMethodExample.displayMessage();
    }
}

