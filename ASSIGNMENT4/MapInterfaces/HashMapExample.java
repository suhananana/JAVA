import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.println("KeySet:");
        for (Integer id : map.keySet())
            System.out.println(id + " -> " + map.get(id));

        System.out.println("EntrySet:");
        for (Map.Entry<Integer, String> e : map.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
