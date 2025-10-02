import java.io.RandomAccessFile;
import java.io.IOException;

public class Random {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
            raf.writeUTF("Hello World!");

            raf.seek(6);
            raf.writeUTF("Java");

            raf.seek(0);
            System.out.println("File Content: " + raf.readUTF());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
