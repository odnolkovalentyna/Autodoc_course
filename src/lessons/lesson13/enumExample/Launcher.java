package lessons.lesson13.enumExample;

public class Launcher {
    public static void main(String[] args) {
        enumCall();
        enumValuesMethod();
        enumWithConstructor();
        String res = gettingCurrency(CountryCurrency.CANADA);
        System.out.println(res);
    }

    public static String gettingCurrency(CountryCurrency countryCurrency) {
        String result = null;
        for (CountryCurrency cc : CountryCurrency.values()) {
            if (cc.equals(countryCurrency)) {
                result = cc.currency;
            }
        }
        return result;
    }


    public static void enumWithConstructor() {
        System.out.println(CountryCurrency.CANADA.currency);
        for (CountryCurrency cc : CountryCurrency.values()) {
            System.out.println(cc + " country currency " + cc.currency);
        }
    }

    public static void enumValuesMethod() {
        for (Car c : Car.values()) {
            System.out.println("Method name " + c.name());
            System.out.println(c);
        }
    }

    public static void enumCall() {
        System.out.println(Car.BMW);
    }
}
