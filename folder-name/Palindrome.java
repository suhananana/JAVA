import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");

        sc.close();
    }
}

