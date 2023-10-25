package lessons.lesson11.logical.operators;

public class OperatorAnd {
    public static void main(String[] args) {
        exampleWithTwoAmpersand();
        exampleWithOneAmpersand();
    }

    public static void exampleWithTwoAmpersand() {
        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);
    }

    public static void exampleWithOneAmpersand() {
        int mouse = 5;
        int weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормить кота! ");
        }
    }


}
