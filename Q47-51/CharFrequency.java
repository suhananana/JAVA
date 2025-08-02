import java.util.HashMap;
public class CharFrequency {

    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequencies:");
        for (char key : freq.keySet()) {
            System.out.println(key + ": " + freq.get(key));
        }
    }
}
