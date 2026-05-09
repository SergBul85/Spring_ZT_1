package spring_introduction;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dog implements Pet {

    private String name;


    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

    private void init() {
        System.out.println("Class dog: init method");
    }

    protected void destroy() {
        System.out.println("Class dog: destroy method");
    }

}
