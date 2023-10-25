package lessons.lesson14.exception;

import java.util.Scanner;

public class ScannerExceptionExample {
    public static void main(String[] args) {
        example2();
    }

    public static void example (){
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int []arr = {3,6,9};

        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Недоступный элемент массива");
        }catch (ArithmeticException e){
            System.err.println("На ноль делить нельзя");
        }
        System.out.println("Программа продолжает свою работу");
    }

    public static void example2 (){
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int []arr = {3,6,9};

        try {
            System.out.println(arr[in] / 0);
        } catch (Exception e){
            System.err.println("Что-то пошло не так");
        }
        System.out.println("Программа продолжает свою работу");
    }
}
