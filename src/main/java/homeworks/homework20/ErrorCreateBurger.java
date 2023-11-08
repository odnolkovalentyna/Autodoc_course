package homeworks.homework20;


public class ErrorCreateBurger extends Exception{

    private String message;

    public ErrorCreateBurger(String message) {
       this.message = message;
    //super(message);
    }

    @Override
    public String toString() {
        return "ErrorCreateBurger{" +
                " Burger not created: " + message + '\'' +
                '}';
    }
}
