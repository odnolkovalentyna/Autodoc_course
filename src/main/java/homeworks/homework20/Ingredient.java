package homeworks.homework20;

public enum Ingredient {

    CHEESE(2.0),
    TOMATO(1.0),
    LETTUCE(0.5);

    private final double price;

    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
