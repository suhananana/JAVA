import java.util.*;

public class PrintCollection {
    public static <T> void printAll(Collection<T> col) {
        for (T item : col)
            System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        printAll(list);
        printAll(set);
    }
}
