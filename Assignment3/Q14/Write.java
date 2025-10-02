import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String text = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
