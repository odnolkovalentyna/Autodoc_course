package homeworks.homework20;
import static homeworks.homework20.Burger.createBurgerByInput;


public class Launcher {

    public static void main(String[] args) throws ErrorCreateBurger {
        Burger burger = createBurgerByInput();
        burger.printBurgerInfo();

    }


}
