package spring_introduction;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
//@Component
@Scope("prototype")
public class Dog implements Pet {

    private String name;


    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("Class dog: init method");
//    }

//    @PreDestroy
//    protected void destroy() {
//        System.out.println("Class dog: destroy method");
//    }

}
