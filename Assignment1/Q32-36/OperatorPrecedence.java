public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2; // Multiplication has higher precedence
        System.out.println("10 + 5 * 2 = " + result); // Output: 20

        int resultWithParens = (10 + 5) * 2; // Parentheses change order
        System.out.println("(10 + 5) * 2 = " + resultWithParens); // Output: 30

        boolean logic = true || false && false; // && evaluated before ||
        System.out.println("true || false && false = " + logic); // Output: true
    }
}
