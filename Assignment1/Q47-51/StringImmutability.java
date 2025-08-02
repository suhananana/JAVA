public class StringImmutability {

    public static void main(String[] args) {
        String str = "Hello";
        String modified = str.concat(" World");

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modified);
    }
}
