import java.io.*;
public class FileOperation {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Welcome to Java File Operations.\n");
            writer.write("This is a sample file.");
            writer.close();
            System.out.println("Data written successfully.");
            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.println("\nFile contents:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
