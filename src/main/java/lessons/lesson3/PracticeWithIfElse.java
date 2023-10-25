package lessons.lesson3;

import java.util.Scanner;

public class PracticeWithIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int num1 = scanner.nextInt();
        if (num1 == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }

    }
}
