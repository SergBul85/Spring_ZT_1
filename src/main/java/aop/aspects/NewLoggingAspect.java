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

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("\taroundReturnBookLoggingAdvice: было поймано исключение " + e);
//            targetMethodResult = "Неизвестное название книги.";
            throw e;
        }

        System.out.println("\taroundReturnBookLoggingAdvice: в библитотеку успешно вернули книгу.");
        return targetMethodResult;
    }
}
