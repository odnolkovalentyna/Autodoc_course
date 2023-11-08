package homeworks.homework20;

public enum MeatType {
    BEEF(5.0),
    CHICKEN(3.0),
    FISH(5.0);

    private final double price;

    MeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
