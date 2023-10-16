package lessons.lesson13.intarfaceExample;

public class Bmw implements ICar, IParts {
    @Override
    public String maxSpeed() {
        return "200";
    }

    @Override
    public void drive() {
        System.out.println("BMW drive");
    }

    @Override
    public void brake() {
        System.out.println("BMW brake");

    }

    @Override
    public int choosePart(int number) {
        return 235235235;
    }
}
