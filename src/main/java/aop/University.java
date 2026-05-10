package aop;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<Student>();

    public void addStudents() {
        Student st1 = new Student("Zaur Tregulov", 4, 7.1);
        Student st2 = new Student("Mikhail Ivanov", 2, 7.2);
        Student st3 = new Student("Elena Sidorova", 1, 7.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents");
        students.forEach(s -> System.out.println("\t" + s));
        return students;
    }

}
