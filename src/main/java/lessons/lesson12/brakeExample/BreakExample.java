package lessons.lesson12.brakeExample;

public class BreakExample {
    public static void main(String[] args) {
       // breakForWhile();
        breakFoInnerLoop();
    }

    public static void breakForWhile() {
        int a = 3;
        int i = 1;

        while (i <= 5) {
            System.out.println("Цикл выполняется дальше " + i + " раз");
            if (i == a) {
                break;
            }
            i++;
        }
    }

    public static void breakFoInnerLoop() {
        outer:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Я первый цикл и выполняюсь " + i + " раз");
            for (int a = 1; a <= 5; a++){
                System.out.println("Я второй внутренний цикл и выполняюсь " + a + " раз");
                if (a ==2){
                    break outer;
                }
            }
        }
    }
}
