package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution (* aop.UniLibrary.*(..)) ")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution (public void aop.UniLibrary.returnMagazine()) ")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsButReturnBookFromUniLibrary() {
//    }
//
//    @Before("allMethodsButReturnBookFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnBookFromUniLibrary() {
//        System.out.println("\tbeforeAllMethodsExceptReturnBookFromUniLibrary:  writing Log #1");
//    }

//    @Pointcut("execution (* aop.UniLibrary.get*()) ")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution (* aop.UniLibrary.return*()) ")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("\tbeforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("\tbeforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("\tbeforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("\tmethodSignature - " + methodSignature);
        System.out.println("\tmethodSignature.getMethod() - " + methodSignature.getMethod());
        System.out.println("\tmethodSignature.getReturnType() - " + methodSignature.getReturnType());
        System.out.println("\tmethodSignature.getName() - " + methodSignature.getName());
        System.out.println("\tmethodSignature.getModifiers() - " + methodSignature.getModifiers());

        if (methodSignature.getName().equals("addBook")) {
            Object[] argumentss = joinPoint.getArgs();
            for (Object obj : argumentss) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("\t\tИнформация о книге:");
                    System.out.println("\t\t" + myBook.getName());
                    System.out.println("\t\t" + myBook.getAuthor());
                    System.out.println("\t\t" + myBook.getYearOfPublication());
                    System.out.println("\t\t----------------------------------");
                } else if (obj instanceof String) {
                    System.out.println("\t\tКнигу добавил:");
                    System.out.println("\t\t" + obj.toString());
                    System.out.println("\t\t----------------------------------");
                }
            }
        }

        System.out.println("\tbeforeGetLoggingAdvice: логирование попытки получить книгу/журнал.");
        System.out.println("\t------------------------------------------------------------------------------------");
    }


}
