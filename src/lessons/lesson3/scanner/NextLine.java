package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String surName = scanner.nextLine();

        System.out.println("Введите вашу фамилию: ");
        String lastMame = scanner.nextLine();
        System.out.println("Ваше имя и фамилия: " + surName + " " + lastMame);
    }
}
