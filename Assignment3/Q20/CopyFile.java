import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("copied.txt")) {

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
