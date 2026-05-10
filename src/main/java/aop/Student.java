package aop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String nameSurname;
    private int course;
    private double avgGrage;

    public Student(String nameSurname, int course, double avgGrage) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrage = avgGrage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGrage=" + avgGrage +
                '}';
    }
}
