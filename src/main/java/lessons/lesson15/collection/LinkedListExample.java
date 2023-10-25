package lessons.lesson15.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    static List<String> myList = new LinkedList<>();

    public static void main(String[] args) {

        addMethod(myList);
        addMethodByIndex(myList,1);
        getNyIndex(myList,0);
        indexOfMethod(myList,"Kostia");
        indexOfMethod(myList,"Sasha");
        setMethod(myList,0,"Sasha");
        removeByIndex(myList,0);
        removeByObject(myList,"Max");
        System.out.println(myList.size());
    }

    public static void removeByObject(List<String> someList,String element) {
        someList.remove(element);
        System.out.println(someList);
    }

    public static void removeByIndex(List<String> someList,int index) {
        someList.remove(index);
        System.out.println(someList);
    }

    public static void setMethod(List<String> someList,int index ,String str) {
        someList.set(index,str);
        System.out.println(someList);
    }

    public static void indexOfMethod(List<String> someList,String str) {
        System.out.println(someList.indexOf(str));
    }

    public static void getNyIndex(List<String> someList,int index) {
        System.out.println(someList.get(index));
    }

    public static void addMethod(List<String> someList) {
        someList.add("Alex");
        someList.add("Kostia");
        System.out.println(someList);
    }

    public static void addMethodByIndex(List<String> someList, int index) {
        someList.add(index,"Max");

        System.out.println(someList);
    }
}
