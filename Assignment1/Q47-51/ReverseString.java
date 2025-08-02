public class ReverseString {

    public static void main(String[] args) {
        String original = "Hello";
        char[] chars = original.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        System.out.println("Reversed string: " + reversed);
    }
}
