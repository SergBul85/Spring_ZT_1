package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("BEFORE etStudentsLoggingAdvice: логируем получение списка студентов.");
//    }

//    @AfterReturning(
//            pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student student = students.get(0);
//
//        String nameSurname = student.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//
//        student.setNameSurname(nameSurname);
//        student.setAvgGrage(1.1);
//
//        System.out.println("AFTER_RETURNING GetStudentsLoggingAdvice: логируем получение списка студентов.");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exeption")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exeption);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное завершение метода или исключения. ");
    }

}
