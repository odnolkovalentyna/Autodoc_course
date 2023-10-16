package lessons.lesson9.incapsulation.cars;

public class Launcher {
    public static void main(String[] args) {
        Honda honda = new Honda(); // потому что модификатор доступа default
        honda.aboutCar();
        System.out.println(honda.fuel);
    }
}
