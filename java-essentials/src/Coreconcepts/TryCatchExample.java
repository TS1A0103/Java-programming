package Coreconcepts;

public class TryCatchExample {

    // Method using throws
    static void processTransaction(int balance, int amount, String pin)
            throws Exception {

        // Manually throwing exceptions
        if (balance <= 0) {
            throw new IllegalStateException("Account balance is invalid");
        }

        if (!pin.equals("1234")) {
            throw new SecurityException("Invalid PIN");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }

        System.out.println("Transaction successful");
    }

    public static void main(String[] args) {

        try {
            processTransaction(5000, 8000, "1234");
        }
        catch (ArithmeticException e) {
            System.out.println("Amount Error: " + e.getMessage());
        }
        catch (SecurityException e) {
            System.out.println("Security Error: " + e.getMessage());
        }
        catch (IllegalStateException e) {
            System.out.println("Account Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
