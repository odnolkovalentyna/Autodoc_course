package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        System.out.println("Введите 2 любых целых число от 1 до 10: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum =  number + number2;
        System.out.println("Сумма введенных чисел : " + sum);
    }

}
