package homeworks.homework18;

public class ErrorOperation extends Exception{
    private double balance;
    private double amount;

    public ErrorOperation(double balance, double amount, String message) {
        super(message);
        this.balance = balance;
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "ErrorOperation{" + " amount of operation: " + balance +
                " balance: " + amount + " " +
                getMessage() +
                '}';
    }
}
