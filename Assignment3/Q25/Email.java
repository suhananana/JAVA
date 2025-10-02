import java.util.regex.*;

public class Email {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email.");
        } else {
            System.out.println(email + " is NOT a valid email.");
        }
    }
}
