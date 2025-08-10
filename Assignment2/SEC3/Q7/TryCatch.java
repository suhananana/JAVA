public class TryCatch {
    public static void main(String[] args){
        int num1 = 10, num2 = 0;

        System.out.println("Try-catch");

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
        System.out.println(" Try-Catch-Finally");
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Finally block executed — cleanup code can go here.");

    }
}
