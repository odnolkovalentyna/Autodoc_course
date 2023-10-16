package lessons.lesson12.finelExample;

final class ClassFinal { //не можем наследоваться

    final void sayHello(){ //запрещает переопределение
        System.out.println("Hello");
    }
    public void sayAge(){
        System.out.println("23");
    }
}
