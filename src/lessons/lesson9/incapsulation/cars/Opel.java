package lessons.lesson9.incapsulation.cars;

public class Opel {

    private String fuel = "petrol";
    private String model = "vectra";

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return this.fuel;
    }

    public String getModel() {
        return this.model;
    }

    private void showModel() {
        System.out.println("our model " + model);
    }

    public void showAllInfo() {
        System.out.println("Fuel of Opel " + fuel);
        showModel();
    }
}
