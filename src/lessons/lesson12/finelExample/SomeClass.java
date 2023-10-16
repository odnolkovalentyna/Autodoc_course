package lessons.lesson12.finelExample;

public class SomeClass extends MethodFinal{

    @Override
    public void sayAge() {
        super.sayAge();
    }

    public void aboutPerson(){
        sayHello();
        sayAge();
    }
}
