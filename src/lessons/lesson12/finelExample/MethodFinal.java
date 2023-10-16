package lessons.lesson12.finelExample;

public class MethodFinal {

    final void sayHello(){ //запрещает переопределение
        System.out.println("Hello");
    }
    public void sayAge(){
        System.out.println("23");
    }
}
