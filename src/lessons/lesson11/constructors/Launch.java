package lessons.lesson11.constructors;

public class Launch {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayAge();
        animal.sayAnimalName();

        Animal animal1 = new Animal("Cat","6");
        animal1.sayAnimalName();
        animal1.sayAge();


        Animal animal2 = new Animal();
        animal2.animalCountry();
    }
}
