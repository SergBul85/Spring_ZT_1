package aop;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Book {
    @Value("Преступление и наказание.")
    private String name;
}
