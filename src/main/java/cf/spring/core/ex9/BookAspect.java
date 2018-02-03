package cf.spring.core.ex9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author vgrigoriev - 1/31/2018
 */

@Aspect
@Component
public class BookAspect {

    @Around(value = "execution(* cf.spring.core.ex9.PaymentService*.*(..))")
    public void multipleAttemptWithdrawMoney(ProceedingJoinPoint joinPoint) {
        for (int i=0;i<3;i++)
        try {
            joinPoint.proceed();
            System.out.println("Attempt success");
            break;
        } catch (Throwable throwable) {
            System.out.print("Attempt " + i + " failed");
        }
    }

    @Pointcut("@annotation(cf.spring.core.ex9.BookLog)")
//    @Pointcut("within(cf.spring.core.ex9.*)")
    public void loggableMethods() {
    }

    @Before("loggableMethods()")
    public void logMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        System.out.println("Executing method with success: " + methodName);
    }
//    @Around("@annotation(LogExecutionTime)")
//    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//        Object proceed = joinPoint.proceed();
//        long executionTime = System.currentTimeMillis() - start;
//        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
//        return proceed;
//    }
}
