package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("MAIN STARTS");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean(UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("В библитотеку вернули книгу " + bookName);

        context.close();
        System.out.println("MAIN ENDS");
    }
}
