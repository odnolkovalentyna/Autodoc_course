package lessons.lesson2;

public class Increment {
    public static void main(String[] args) {
        int i = 2;
        i++;
        System.out.println(i);

        int k = 2, b = 2, c = 2, n = 2;
        int postFix = 2 * k++;
        System.out.println(postFix);
        System.out.println(k);
        int preFix = 2 * ++b;
        System.out.println(preFix);
    }
}
