package lessons.lesson8.oop.common;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        new Person().aboutPerson(); //сокращенная запись
    }
}
