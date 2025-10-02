import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Public"); // change path

        if (dir.isDirectory()) {
            String[] files = dir.list();
            System.out.println("Files in directory:");
            for (String name : files) {
                System.out.println(name);
            }
        } else {
            System.out.println("Not a directory.");
        }
    }
}
