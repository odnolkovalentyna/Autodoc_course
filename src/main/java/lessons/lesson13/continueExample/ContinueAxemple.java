package lessons.lesson13.continueExample;

public class ContinueAxemple {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            System.out.println(i + " раз выполнился перед continue");
            if (i > 2) continue;
                System.out.println("     " +i +" после continue");

        }
    }
}
