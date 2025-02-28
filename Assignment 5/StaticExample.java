class StaticExample {
    static int counter = 0; // static variable

    // static method
    static void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) {
        StaticExample.incrementCounter();  // Calling static method
        StaticExample.incrementCounter();
        System.out.println("Counter value: " + StaticExample.counter);
    }
}
