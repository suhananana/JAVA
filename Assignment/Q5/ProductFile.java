import java.io.*;

public class ProductFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("products.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
