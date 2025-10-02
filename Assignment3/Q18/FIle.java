import java.io.File;
import java.io.IOException;

public class FIle {
    public static void main(String[] args) {
        File file = new File("newfile.txt");

        try {
            if (file.exists()) {
                System.out.println("File exists: " + file.getAbsolutePath());
            } else {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
