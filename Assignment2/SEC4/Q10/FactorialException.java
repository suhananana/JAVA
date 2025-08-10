class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class FactorialException {
    static long factorial(int n) throws NegativeNumberException {

        if (n < 0) {
            throw new NegativeNumberException("Factorial is not defined for negative numbers.");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = -5;

        try {

            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);

        }

        catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
