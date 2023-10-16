package lessons.lesson13.abstractClassAxample;

public class Toyota extends Car{

    public Toyota(String typeFuel){
        super(typeFuel);
    }
    @Override
    String maxSpeed() {
        return "180";
    }

    @Override
    void drive() {
        System.out.println("Toyota drive");
    }

    @Override
    void brake() {
        System.out.println("Toyota brake");
    }
}
