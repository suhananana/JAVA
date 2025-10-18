import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayListExample<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String n : names)
            System.out.println(n);
    }
}
