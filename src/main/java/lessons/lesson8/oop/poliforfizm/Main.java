package lessons.lesson8.oop.poliforfizm;

public class Main {
    public static void main(String[] args) {
        add(9,6);
        add(5);
        add(5.1,7.5);
        add("Alex", 34);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a) {
        return a + 10;
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static String add(String a, int b) {
        return a + " " + b;
    }


}
