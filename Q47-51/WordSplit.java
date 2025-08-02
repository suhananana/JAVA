public class WordSplit {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");

        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
