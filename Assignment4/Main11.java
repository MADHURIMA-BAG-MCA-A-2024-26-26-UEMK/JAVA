class Example {
    int x;  // Instance variable

    public Example(int x) {
        this.x = x;  // 'this.x' refers to the instance variable, while 'x' refers to the local variable
    }

    public void display() {
        System.out.println("Instance variable x: " + this.x);  // Referring to the instance variable
    }
}

public class Main11 {
    public static void main(String[] args) {
        Example example = new Example(10);
        example.display();  // It will refer to the instance variable 'x'
    }
}

