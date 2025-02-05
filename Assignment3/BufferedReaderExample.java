import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Create BufferedReader object to read input from the console
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            
            // Read a line of text from the user
            String name = reader.readLine();
            
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the BufferedReader
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

