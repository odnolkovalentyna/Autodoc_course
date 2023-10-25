package lessons.lesson14.exception;

public class LauncherForCustomException {
    public static void main(String[] args) throws CustomException {
        computer(11);

    }

    public static void computer(int number) throws CustomException {
        System.out.println("computer метод вызван");
        if (number>10){
            throw new CustomException(number, " some message about exception");
        }
        System.out.println("нормальное завершение метода");
    }
}
