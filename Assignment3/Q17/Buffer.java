import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        String fileName = "buffered.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("This is a BufferedWriter example.");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
