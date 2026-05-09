package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfiig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!!!!!!!!!!!!!!");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
