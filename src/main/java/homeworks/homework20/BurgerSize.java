package homeworks.homework20;

public enum BurgerSize {
    SMALL (5.0),
    MEDIUM (10.0),
    LARGE(15.0);

    private final double price;

    BurgerSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
