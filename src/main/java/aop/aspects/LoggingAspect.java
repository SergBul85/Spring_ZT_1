package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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


    @Before("aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("\tbeforeGetLoggingAdvice: логирование попытки получить книгу/журнал.");
    }


}
