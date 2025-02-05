import java.util.Scanner;

class ThreeDObject {
    // Method to calculate surface area (to be overridden)
    public double wholeSurfaceArea() {
        return 0;
    }

    // Method to calculate volume (to be overridden)
    public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);  // Surface area of box
    }

    @Override
    public double volume() {
        return length * width * height;  // Volume of box
    }
}

class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);  // Calling the parent class constructor for a cube
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * Math.pow(length, 2);  // Surface area of cube
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);  // Volume of cube
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);  // Surface area of cylinder
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;  // Volume of cylinder
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));  // Surface area of cone
    }

    @Override
    public double volume() {
        return (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;  // Volume of cone
    }
}

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For Box
        System.out.println("Enter dimensions for Box (length, width, height): ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // For Cube
        System.out.println("Enter side for Cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // For Cylinder
        System.out.println("Enter radius and height for Cylinder: ");
        double radius = sc.nextDouble();
        double cylHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, cylHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // For Cone
        System.out.println("Enter radius and height for Cone: ");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}

