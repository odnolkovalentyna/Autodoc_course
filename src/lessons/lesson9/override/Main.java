package lessons.lesson9.override;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        LittleCat littleCat = new LittleCat();
        littleCat.voice();
        littleCat.eat();

    }


}
