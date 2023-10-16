package lessons.lesson12.staticExample.staticChanging;

public class StaticMethods {

    static String str = "Hello";
    // String str = "Hello"; - без статика нельзя использовать в статическом методе
    static void satHello(){
        System.out.println(str);
    }
}
