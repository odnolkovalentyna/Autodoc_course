package lessons.lesson9.incapsulation.launch;

import lessons.lesson9.incapsulation.cars.*;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.aboutCar();
        System.out.println(bmw.fuel);

        Honda honda = new Honda();
        honda.publicaboutCar();
        Honda2 honda2 = new Honda2();
        honda2.aboutCar();

        Skoda scoda = new Skoda();
        scoda.showAllInfo();
        String model = scoda.getModel();
        System.out.println(model);

        Opel opel = new Opel();
        opel.setFuel("diesel");
        opel.setModel("Omega");
        System.out.println(opel.getFuel() + " it is fuel");
        opel.showAllInfo();

        Opel opel1 = new Opel();
        opel1.showAllInfo();

    }
}
