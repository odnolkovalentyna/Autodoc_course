package lessons.lesson3;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите еще целое число: ");
        int num2 = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner1.nextLine();
        int result = num1 + num2;

        System.out.println(name + "  " + result);
    }
}
