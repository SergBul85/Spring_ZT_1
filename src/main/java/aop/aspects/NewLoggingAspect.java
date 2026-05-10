package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution( public String returnBook() )")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("\taroundReturnBookLoggingAdvice: в библитотеку пытаются вернуть книгу.");

        long startTime = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult="Book_2";
        long endTime = System.currentTimeMillis();
        System.out.println("\t" + (endTime - startTime));

        System.out.println("\taroundReturnBookLoggingAdvice: в библитотеку успешно вернули книгу.");
        return targetMethodResult;
    }
}
