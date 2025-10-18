import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After adding: " + list);

        list.remove("Python");
        System.out.println("After removing by value: " + list);

        list.remove(0);
        System.out.println("After removing by index: " + list);

        list.set(0, "Go");
        System.out.println("After replacing: " + list);
    }
}
