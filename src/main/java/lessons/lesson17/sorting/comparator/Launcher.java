package lessons.lesson17.sorting.comparator;

import java.util.TreeSet;

public class Launcher {
    public static void main(String[] args) {
       CarComparatorByYear carComparatorByYear = new CarComparatorByYear();
        TreeSet<Car> carThreeSet = new TreeSet<Car>(carComparatorByYear);
        carThreeSet.add(new Car("BMW", 2020));
        carThreeSet.add(new Car("Mercedes", 2016));
        carThreeSet.add(new Car("Opel", 2010));
        carThreeSet.add(new Car("Volvo", 2005));

        for (Car car : carThreeSet){
            System.out.println(car);
        }

    }
}
