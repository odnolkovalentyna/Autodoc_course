package lessons.lesson17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilMethodsForCollection {


    public static void main(String[] args) {
        sortMethods();
        shuffleMethods();
        minMaxMethod();
        frequencyMethod();
    }

    public static void frequencyMethod() {
        List<Integer> colorlist = Arrays.asList(12, 34, 56, 767, 2, 2, 2, 2, 23, 4, 5);
        System.out.println(Collections.frequency(colorlist, 2));

    }

    public static void minMaxMethod() {
        List<Integer> colorlist = Arrays.asList(12, 34, 56, 767, 3, 4, 5);
        System.out.println(Collections.max(colorlist));
        System.out.println(Collections.min(colorlist));
    }

    public static void shuffleMethods() {
        List<String> colorList = Arrays.asList("Красный", "Желтый", "Синий");

        Collections.shuffle(colorList);
        System.out.println("Коллекция после shuffle " + colorList);
    }

    public static void sortMethods() {
        List<String> colorList = Arrays.asList("Красный", "Желтый", "Синий");
        System.out.println("Коллекция до сортировки " + colorList);
        Collections.sort(colorList);
        System.out.println("Коллекция после сортировки " + colorList);

        colorList.sort(Collections.reverseOrder());
        System.out.println("Коллекция после reverseOrder " + colorList);
    }

    public static void asListMethod() {
        String[] arr = {"foo", "baa", "baz"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}

