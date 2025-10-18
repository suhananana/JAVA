import java.util.*;

public class PriorityExample {
    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("Write report");
        tasks.add("Attend meeting");
        tasks.add("Submit assignment");

        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }
    }
}
