package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Student st01 = new Student("amal" , 20);
        Student st02 = new Student("kamal" , 14);
        Student st03 = new Student("jon" , 25);

        studentList.add(st01);
        studentList.add(st02);
        studentList.add(st03);

        Comparator<Student> byAge = (a , b ) -> a.age.compareTo(b.age);

        studentList.sort(byAge);
        studentList.forEach(System.out::println);  // studentList.forEach(p -> System.out.println(byAge));

    }
}
