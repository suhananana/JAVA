import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String text = "This is a FileWriter example.";
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(text);
            System.out.println("Data written to example.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
