package spring_introduction;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog implements Pet {

    private String name;


    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }
}
