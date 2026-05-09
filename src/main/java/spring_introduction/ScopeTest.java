package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog1 = (Dog) context.getBean("dog");
        Dog dog2 = (Dog) context.getBean("dog");

        System.out.println(dog1 == dog2);
        System.out.println(dog1);
        System.out.println(dog2);

        context.close();
    }
}
