package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiig.class);

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        System.out.println(cat1 == cat2);

        context.close();
    }
}
