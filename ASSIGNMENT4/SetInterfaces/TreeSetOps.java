import java.util.*;

public class TreeSetOps {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 5, 20, 15));
        System.out.println("Smallest: " + set.first());
        System.out.println("Largest: " + set.last());

        set.remove(15);
        System.out.println("After removal: " + set);
    }
}
