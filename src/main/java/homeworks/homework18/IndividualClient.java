package homeworks.homework18;

public class IndividualClient extends Client {

    @Override
    void deposit(double amount) throws ErrorOperation {
        if (amount < 0) {
            throw new ErrorOperation(amount, getAmount(), "The deposit amount cannot be negative");
        } else {
            setAmount(getAmount() + amount);
            System.out.println("Deposit: " + amount + " Euro" + " Commission: 0 Euro");
            getInfo();
        }

    }

    @Override
    void withdrawal(double amount) throws ErrorOperation {
        if (amount > getAmount()) {
            throw new ErrorOperation(amount, getAmount(), "Withdrawal amount exceeds balance");
        } else if (amount < 0) {
            throw new ErrorOperation(amount, getAmount(), "Withdrawal amount cannot be negative");
        } else {
            setAmount(getAmount() - amount);
            System.out.println("Withdrawal amount: " + amount + " Euro" + " Commission: 0 Euro");
            getInfo();
        }

    }

    @Override
    void getInfo() {
        System.out.println("Individual Client: " + getName()
                + "\nNo commission."
                + "\nCurrent balance: " + getAmount() + " Euro" + "\n");
    }


}
