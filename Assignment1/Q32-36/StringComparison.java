public class StringComparison {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("Using == : " + (str1 == str2));           // false
        System.out.println("Using equals(): " + str1.equals(str2));   // true
    }
}
