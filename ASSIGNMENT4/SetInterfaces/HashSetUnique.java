import java.util.*;

public class HashSetUnique {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate ignored

        System.out.println("Set elements: " + set);
    }
}
