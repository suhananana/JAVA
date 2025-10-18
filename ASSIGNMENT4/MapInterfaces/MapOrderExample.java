import java.util.*;

public class MapOrderExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C"); hashMap.put(1, "A"); hashMap.put(2, "B");

        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(3, "C"); linkedMap.put(1, "A"); linkedMap.put(2, "B");

        System.out.println("HashMap Order: " + hashMap);
        System.out.println("LinkedHashMap Order: " + linkedMap);
    }
}
