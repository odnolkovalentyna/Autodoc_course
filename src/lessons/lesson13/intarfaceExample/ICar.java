package lessons.lesson13.intarfaceExample;

public interface ICar extends IParts, IOther{

    String OTHER_TYPE_FUEL = "Diesel";

    String maxSpeed();

    void drive();

    void brake();

    default void getFuel(String typefuel){
        System.out.println(typefuel);
    }

    private void utilMethod(){
        //method only for interface
    }


}
