import banking.*;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        acc.deposit(2000);

        Loan loan = new Loan();
        loan.sanction(10000);
    }
}
