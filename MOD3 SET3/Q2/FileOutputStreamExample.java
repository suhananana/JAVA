import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String data = "Java I/O Streams Example";
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
