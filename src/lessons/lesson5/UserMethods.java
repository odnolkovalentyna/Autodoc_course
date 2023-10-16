package lessons.lesson5;

import java.util.Scanner;

public class UserMethods {
    public static void main(String[] args) {

        sayHello();
        getStrAndPrint("Hello world");
        getStrAndPrint("Hello guys");
        int res = sum(10, 7);
        System.out.println(res);

        String aboutYou = getNameAndSurname("Alex", "Mushkambarian", 34);
        System.out.println(aboutYou);

        int sumOfOrder = 100;
        int finelSum = sumFromConsole() + sumOfOrder;
        System.out.println(finelSum);

    }

    public static int sumFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;

    }

    public static String getNameAndSurname(String name, String surname, int age) {
        return name + " " + surname + " " + age;
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static void getStrAndPrint(String str) {
        System.out.println("You enter " + str);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

}
