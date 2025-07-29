import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Valid{

    // Java reserved keywords
    private static final Set<String> keywords = new HashSet<>();

    static {
        String[] keywordArray = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "const", "continue", "default", "do", "double", "else", "enum",
                "extends", "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native", "new", "package",
                "private", "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient",
                "try", "void", "volatile", "while", "null", "true", "false"
        };
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }
    }

    // Method to check if the identifier is valid
    public static boolean isValidIdentifier(String str) {
        if (str == null || str.isEmpty()) return false;

        // Check if it's a keyword
        if (keywords.contains(str)) return false;

        // Check first character
        char firstChar = str.charAt(0);
        if (!Character.isLetter(firstChar) && firstChar != '_' && firstChar != '$') {
            return false;
        }

        // Check remaining characters
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_' && ch != '$') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter identifiers to check (type 'exit' to quit):");
        while (true) {
            System.out.print("Identifier: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (isValidIdentifier(input)) {
                System.out.println("'" + input + "' is a VALID identifier.\n");
            } else {
                System.out.println("'" + input + "' is an INVALID identifier.\n");
            }
        }

        scanner.close();
    }
}
