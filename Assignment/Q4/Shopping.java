class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}

public class Shopping {
    static int stock = 5;

    static void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock)
            throw new OutOfStockException("Not enough stock! Only " + stock + " items left.");
        else
            System.out.println("Purchase successful! Remaining stock: " + (stock - quantity));
    }

    public static void main(String[] args) {
        try {
            purchase(7);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
