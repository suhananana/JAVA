import java.util.*;

public class SortListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));

        Collections.sort(list);
        System.out.println("Alphabetical: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse: " + list);
    }
}
