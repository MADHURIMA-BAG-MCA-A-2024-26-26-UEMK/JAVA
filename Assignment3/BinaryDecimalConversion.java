import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal equivalent: " + decimal);
        
        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        String binaryStr = Integer.toBinaryString(decimalNum);
        System.out.println("Binary equivalent: " + binaryStr);
    }
}
