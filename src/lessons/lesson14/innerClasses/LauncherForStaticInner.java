package lessons.lesson14.innerClasses;

public class LauncherForStaticInner {

    public static void main(String[] args) {
        OuterCarStatic.Inner_Electric inner_electric = new OuterCarStatic.Inner_Electric();
        inner_electric.turnOnIgnition();
    }
}
