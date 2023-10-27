package homeworks.homework18;

public class IndividualEntrepreneur extends Client {
    @Override
    void deposit(double amount) throws ErrorOperation {
        if (amount < 0) {
            throw new ErrorOperation(amount, getAmount(), "The deposit amount cannot be negative");
        }
        double commission = 0;
        if (amount <= 1000) {
            commission = amount * 0.01;
            setAmount(getAmount() + (amount - commission));
        } else if (amount > 1000) {
            commission = amount * 0.005;
            setAmount(getAmount() + (amount - commission));
        }
        System.out.println("Deposit: " + amount + " Euro" + " commission: " + commission + " Euro");
        getInfo();

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
        System.out.println("Individual Entrepreneur: " + getName()
                + "\nDeposit commission 1% for amounts less than 1000 Euro, and 0.5% for amounts over 1000 Euro"
                + "\nCurrent balance: " + getAmount() + " Euro" + "\n");
    }
}
