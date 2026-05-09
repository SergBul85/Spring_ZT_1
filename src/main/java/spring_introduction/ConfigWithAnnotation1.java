package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        // Получить все ID бинов
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        System.out.println("Все бины в контексте:");
        for (String beanName : beanDefinitionNames) {
            System.out.println("  - " + beanName);
        }

        context.close();
    }
}
