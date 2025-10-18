import java.util.*;

public class PalindromeDeque {
    public static void main(String[] args) {
        String str = "madam";
        Deque<Character> dq = new ArrayDeque<>();

        for (char c : str.toCharArray()) dq.addLast(c);

        boolean isPal = true;
        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                isPal = false;
                break;
            }
        }
        System.out.println(str + " is palindrome? " + isPal);
    }
}
