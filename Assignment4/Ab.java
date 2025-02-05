class A {
    int x;

    public A(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("Value of x: " + x);
    }
}

class B {
    A aObj;

    public B(A aObj) {
        this.aObj = aObj; // Passing the object of class A as an argument
    }

    public void show() {
        aObj.display();
    }
}

public class Ab {
    public static void main(String[] args) {
        A aObject = new A(100);
        B bObject = new B(aObject); // Passing object of class A to class B
        bObject.show(); // Will show the value of x in class A
    }
}

