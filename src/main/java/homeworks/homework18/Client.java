package homeworks.homework18;

abstract class Client {

    private String name;
    private double amount;

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) throws ErrorOperation {
        if (amount < 0){
            throw new ErrorOperation(getAmount(),amount,"The balance cannot be negative");
        } else {
            this.amount = amount;
        }

    }

    abstract void deposit(double amount) throws ErrorOperation;

    abstract void withdrawal(double amount) throws ErrorOperation;

    abstract void getInfo();

    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", amount=" + getAmount() +
                '}';
    }
}
