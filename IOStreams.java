import java.io.*;
public class IOStreams {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.txt");
            String text = "Java I/O Streams Example";
            byte[] data = text.getBytes();
            output.write(data);
            output.close();
            System.out.println("Data written successfully.");
            FileInputStream input = new FileInputStream("data.txt");
            int ch;
            System.out.println("\nFile contents:");
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
