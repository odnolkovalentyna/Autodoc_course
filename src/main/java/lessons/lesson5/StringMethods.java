package lessons.lesson5;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        lengthMethod();
        concatMethod();
        trimMethod();
        endWithMethod();
        caseMethod();
        equalsMethod();
        containsMethod();
        charAtMethod();
        toCharArrayMethod();
        indexOfMethod();
        substringMethod();
        replaceMethod();
    }

    public static void replaceMethod(){
        String str = "My Name is Alex";
        System.out.println(str.replace("Alex", "Max"));

    }

    public static void substringMethod(){
        String str = "My Name is Alex";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,7));
    }

    public static void indexOfMethod(){
        String str = "My Name is Alex";
        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("Alex"));
        System.out.println(str.indexOf("sdfghh"));
    }

    public static void toCharArrayMethod(){
        String str = "My Name is Alex";
        char[] result = str.toCharArray();
        for (Character r : result){
            System.out.print(r+" ");
        }
        System.out.println();

    }

    public static void charAtMethod(){
        String str1 = "My Name is Alex";
        char result = str1.charAt(4);
        System.out.println(result);
    }

    public static void containsMethod(){
        String str1 = "My Name is Alex";
        String str2 = "Alex";
        boolean result = str1.contains(str2);
        System.out.println(str1.equals(str2));
    }

    public static void equalsMethod(){
        String str1 = "My Name is Alex";
        String str2 = "My Name is Alex";
        System.out.println(str1.equals(str2));
    }

    public static void caseMethod(){
        String str = "My Name is Alex";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();
        System.out.println(toUpper);
        System.out.println(toLower);
    }

    public static void endWithMethod(){
        String str = "My name is Alex";
        boolean ends1 = str.endsWith("Alex");
        boolean ends2 = str.endsWith("Max");
        System.out.println(ends1);
        System.out.println(ends2);
    }

    public static void trimMethod(){
        String str = "      My name is Alex    ";
        System.out.println(str.trim());
    }

    public static void concatMethod(){
        String text1 = "Hello ";
        String text2 = "world";
        String result = text1.concat(text2);
        System.out.println(result);
    }

    public static void lengthMethod(){
        String name = "Alex Alex";
        System.out.println(name.length());
    }
}
