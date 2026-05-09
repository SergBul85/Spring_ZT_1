package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;
    private String surname;
    private int age;


//    public Person() {
//        System.out.println("Person bean is created");
//    }

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: Set Pet.");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: Set Surname.");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: Set Age.");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }

}
