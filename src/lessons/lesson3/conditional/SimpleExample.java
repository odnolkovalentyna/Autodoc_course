package lessons.lesson3.conditional;

public class SimpleExample {
    public static void main(String[] args) {
        simple();
        difficult();
    }

    public static void difficult(){
        int num1 = 6;
        int num2 = 6;
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else if (num1 > num2){
            System.out.println("Первое число больше второго");
        } else if (num1 < num2){
            System.out.println("Первое число меньше второго");
        }
        System.out.println("Числа не равны");
    }

    public static void simple() {
        int num1 = 6;
        int num2 = 10;
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}
