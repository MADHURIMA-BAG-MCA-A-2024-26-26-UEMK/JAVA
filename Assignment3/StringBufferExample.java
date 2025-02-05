public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("append(): " + sb);

        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        sb.delete(5, 10);
        System.out.println("delete(): " + sb);

        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        System.out.println("charAt(0): " + sb.charAt(0));
        System.out.println("length(): " + sb.length());
        System.out.println("capacity(): " + sb.capacity());

        sb.setLength(5);
        System.out.println("setLength(5): " + sb);

        sb.ensureCapacity(100);
        System.out.println("ensureCapacity(100): " + sb.capacity());

        System.out.println("toString(): " + sb.toString());
    }
}

