package lessons.lesson14.innerClasses.anonymous;

public class Launcher {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessege(new Message() {
            @Override
            public String helloMessage() {
                return "Hello guys";
            }
        });


    }
}
