package lesson30.predicateExample;

import java.util.function.Predicate;

public class ForTest {

    public static void main(String[] args) {
        MyPredicate myPredicate = new MyPredicate() {
            @Override
            public boolean test(Integer value) {
                return value > 0;
            }
        };

        System.out.println(myPredicate.test(5));


        //лянда выражение
        //x -> x < 0;
        MyPredicate myPredicate1 = value -> value < 0;
        System.out.println(myPredicate1.test(5));

        //для долгого скрипта
        MyPredicate myPredicate2 = value -> {
            return value < 0;
        };


        Predicate<Integer> predicate = x -> x > 0;

    }
}
