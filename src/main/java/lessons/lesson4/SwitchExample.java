package lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
switchCondition();
    }

    public static void switchCondition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число равное 1, 2 или 3: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Вы ввели число равное 1");
                break;
            case 2:
                System.out.println("Вы ввели число равное 2");
                break;
            case 3:
                System.out.println("Вы ввели число равное 3");
                break;
            default:
                System.out.println("Вы ввели число не равное 1, 2 или 3");
        }

    }

    public static void simpleCondition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число равное 1, 2 или 3: ");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Вы ввели число равное 1");
        } else if (num == 2) {
            System.out.println("Вы ввели число равное 2");
        } else if (num == 3) {
            System.out.println("Вы ввели число равное 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
