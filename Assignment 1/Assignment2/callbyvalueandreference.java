public class CallByValueExample {

    // Method that takes a primitive type (Call by Value)
    public static void modifyValue(int num) {
        num = num * 2;  // Changes the local copy
        System.out.println("Inside modifyValue: " + num);  // Prints modified value
    }

    public static void main(String[] args) {
        int originalValue = 10;
        System.out.println("Before modifyValue: " + originalValue);
        
        // Calling method with primitive type argument (Call by Value)
        modifyValue(originalValue);
        
        // Original value remains unchanged outside the method
        System.out.println("After modifyValue: " + originalValue);
    }
}
