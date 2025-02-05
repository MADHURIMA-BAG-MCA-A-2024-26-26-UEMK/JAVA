public class StringHandling {
    public static void main(String[] args) {
        // Immutable String Example
        String str = "Hello";
        str = str.concat(" World");
        System.out.println("Immutable String: " + str);

        // Mutable String (StringBuilder)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("Mutable String: " + sb.toString());

        // Using String Methods
        String example = "  Java Programming  ";
        System.out.println("charAt(0): " + example.charAt(0));
        System.out.println("compareTo: " + example.compareTo("Java"));
        System.out.println("equals: " + example.equals("Java Programming  "));
        System.out.println("equalsIgnoreCase: " + example.equalsIgnoreCase("java programming  "));
        System.out.println("indexOf('P'): " + example.indexOf('P'));
        System.out.println("length: " + example.length());
        System.out.println("substring(2, 6): " + example.substring(2, 6));
        System.out.println("toLowerCase: " + example.toLowerCase());
        System.out.println("toUpperCase: " + example.toUpperCase());
        System.out.println("trim: " + example.trim());
        System.out.println("valueOf(123): " + String.valueOf(123));
    }
}

