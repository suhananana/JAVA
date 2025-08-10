import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList();
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Mango");

        Collections.sort(names, (s1,s2) -> s2.compareTo(s1));
        System.out.println("Sort in Descending Order: " + names);
    }
}
