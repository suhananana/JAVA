import java.util.*;

public class IterateList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        // a. Simple for loop
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        // b. Enhanced for loop
        for (int n : list)
            System.out.println(n);

        // c. Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
