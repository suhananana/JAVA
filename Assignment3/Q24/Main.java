import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date: " + date);

        Calendar cal = Calendar.getInstance();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // 0-based
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Time: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
    }
}
