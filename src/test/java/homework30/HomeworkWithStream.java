package homework30;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeworkWithStream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 28),
                new Person("David", 26)
        );

        //Фильтрация людей старше 25 лет.
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());


        //Сортировка результата по имени в алфавитном порядке.
        List<Person> sortedPeople = filteredPeople.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        //Преобразование каждого объекта Person в строку в формате "Имя - Возраст".
        List<String> formattedStrings = sortedPeople.stream()
                .map(person -> person.getName() + " - " + person.getAge())
                .collect(Collectors.toList());

        //Выведение полученного результат в консоль.
        formattedStrings.forEach(System.out::println);
    }


}
