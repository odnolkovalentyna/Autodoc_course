package lesson30.streamApi.workingWithObject;

public class Car {

    private String model;
    private int year;

    public Car(String name, int year) {
        this.model = name;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
