package homeworks.homework17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ComparatorByAG comparatorByAverageGrade = new ComparatorByAG();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 5.0));
        students.add(new Student("Oleg", 3.2));
        students.add(new Student("Anna", 1.2));
        students.add(new Student("Jack", 4.4));
        students.add(new Student("Max", 4.0));

        students.sort(comparatorByAverageGrade);

        for (Object student : students){
            System.out.println(student);
        }

    }


}
