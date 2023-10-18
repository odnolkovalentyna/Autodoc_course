package lessons.lesson16.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

   static Set<String> mySet = new LinkedHashSet<>();

    public static void main(String[] args) {

        addMethodExample(mySet);
        removeMethodExample(mySet,"Alex");
        containsMethodExample(mySet,"Igor");
        containsMethodExample(mySet,"Elena");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isEmptyMethodExample(mySet);
    }

    static void addMethodExample(Set<String> someSet){
        someSet.add("Alex");
        someSet.add("Alex");
        someSet.add("Max");
        someSet.add("Igor");
        System.out.println(someSet);
    }

    static void removeMethodExample(Set<String> someSet, String removeOb){
        System.out.println("Before remove "+someSet);
        someSet.remove(removeOb);
        System.out.println("After remove "+someSet);
    }

    static void containsMethodExample(Set<String> someSet, String containsOb){
        System.out.println("Set contains " + containsOb+ " - " + someSet.contains(containsOb));
    }

    static void sizeMethodExample(Set<String> someSet){
        System.out.println("Set size is " + someSet.size());
    }

    static void clearMethodExample(Set<String> someSet){
        System.out.println("Set size before clear  " + someSet.size());
        someSet.clear();
        System.out.println("Set size after clear  " + someSet.size());
    }

    static void isEmptyMethodExample(Set<String> someSet){
        System.out.println("Is set empty " + someSet.isEmpty());
        addMethodExample(someSet);
        System.out.println("Is set empty " + someSet.isEmpty());
    }

}
